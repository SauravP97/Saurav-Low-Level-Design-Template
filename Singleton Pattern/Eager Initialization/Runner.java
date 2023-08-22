package singleton.eager;

import singleton.eager.CacheService;

public class Runner {
    public static void main(String[] args) {
        System.out.println("============== Eager Implementation ============== \n");
        CacheService service = CacheService.getCache();
        System.out.println("Got the instance for the first time \n");
        
        service.store(1, "Saurav");
        System.out.println("Added a key value pair: [1, Saurav] \n");

        CacheService secondService = CacheService.getCache();
        System.out.println("Got the instance for the second time \n");

        String value = secondService.getValue(1);
        System.out.println("Value returned from the second Cache service: " + value);
        System.out.println("This proves that a single instance will be returned everytime. \n");
    }
}