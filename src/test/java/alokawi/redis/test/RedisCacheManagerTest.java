/**
 * 
 */
package alokawi.redis.test;

import java.util.UUID;

import alokawi.redis.core.RedisCacheManager;
import junit.framework.TestCase;

/**
 * @author alokkumar
 *
 */
public class RedisCacheManagerTest extends TestCase {

	public void testRedisCachePutAndGet() {
		RedisCacheManager cacheManager = new RedisCacheManager();
		for (int i = 0; i < 100000; i++) {

			String key = UUID.randomUUID().toString();
			String value = UUID.randomUUID().toString();
			cacheManager.putCacheEntry(key, value);
			assertEquals(value, cacheManager.getCacheEntry(key));

		}
	}

}
