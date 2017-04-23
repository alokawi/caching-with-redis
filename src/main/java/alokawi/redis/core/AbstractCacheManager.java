/**
 * 
 */
package alokawi.redis.core;

/**
 * @author alokkumar
 *
 */
public abstract class AbstractCacheManager<K, V> {

	abstract void putCacheEntry(K key, V value);

	abstract V getCacheEntry(K key);
	
	public abstract void getStatus();
	
}
