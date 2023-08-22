package singleton.lazy;

import singleton.lazy.CacheService;

public class Runner {
    public static void main(String[] args) {
        CacheService service = CacheService.getCache();
        System.out.println("Got the instance for the first time");
        
        service.store(1, "Saurav");
        System.out.println("Added a key value pair: [1, Saurav]");

        CacheService secondService = CacheService.getCache();
        System.out.println("Got the instance for the second time");

        String value = secondService.getValue(1);
        System.out.println("Value returned from the second Cache service: " + value);
        System.out.println("This proves that a single instance will be returned everytime.");
    }
}