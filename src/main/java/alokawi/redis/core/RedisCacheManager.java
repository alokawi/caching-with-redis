/**
 * 
 */
package alokawi.redis.core;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.api.StatefulRedisConnection;
import com.lambdaworks.redis.api.sync.RedisStringCommands;

/**
 * @author alokkumar
 *
 */
public class RedisCacheManager extends AbstractCacheManager<String, String> {

	private static final String CACHE_ONE = "cache-01";
	private static final String CACHE_TWO = "cache-02";
	private StatefulRedisConnection<String, String> redisConnection;

	public RedisCacheManager() {
		initializeCacheManager();
	}

	private void initializeCacheManager() {
		RedisClient redisClient = RedisClient.create("redis://localhost");
		redisConnection = redisClient.connect();
	}

	@Override
	public void putCacheEntry(String key, String value) {
		RedisStringCommands<String, String> redisCommand = null;
		redisCommand = redisConnection.sync();
		redisCommand.set(key, value);
	}

	@Override
	public String getCacheEntry(String key) {
		RedisStringCommands<String, String> redisCommand = redisConnection.sync();
		return redisCommand.get(key);
	}

	@Override
	public void getStatus() {
	}

}
