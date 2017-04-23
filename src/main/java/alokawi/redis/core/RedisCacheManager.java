/**
 * 
 */
package alokawi.redis.core;

/**
 * @author alokkumar
 *
 */
public class RedisCacheManager extends AbstractCacheManager<String, String> {

	private static final String CACHE_ONE = "cache-01";
	private static final String CACHE_TWO = "cache-02";

	public RedisCacheManager() {
		initializeCacheManager();
	}

	private static void initializeCacheManager() {
	}

	@Override
	public void putCacheEntry(String key, String value) {
	}

	@Override
	public String getCacheEntry(String key) {
		return null;
	}

	@Override
	public void getStatus() {
	}

}
