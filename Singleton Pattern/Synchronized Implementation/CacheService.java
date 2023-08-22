package singleton.sync;

import java.util.HashMap;

// Singleton Class for Cache Service - Lazy Implementation.
public class CacheService {
    private static CacheService service = null;
    private HashMap<Integer, String> cacheMap;

    private CacheService() {
        cacheMap = new HashMap<Integer, String>();
    }

    public static synchronized CacheService getCache() {
        if (service == null) {
            service = new CacheService();
        }
        return service;
    }

    public String getValue(int key) {
        return cacheMap.getOrDefault(key, "");
    }

    public void store(int key, String value) {
        cacheMap.put(key, value);
    }
}