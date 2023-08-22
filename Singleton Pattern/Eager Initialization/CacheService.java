package singleton.eager;

import java.util.HashMap;

// Singleton Class for Cache Service - Eager Implementation.
public class CacheService {
    private static CacheService service = new CacheService();
    private HashMap<Integer, String> cacheMap;

    private CacheService() {
        cacheMap = new HashMap<Integer, String>();
    }

    public static CacheService getCache() {
        return service;
    }

    public String getValue(int key) {
        return cacheMap.getOrDefault(key, "");
    }

    public void store(int key, String value) {
        cacheMap.put(key, value);
    }
}