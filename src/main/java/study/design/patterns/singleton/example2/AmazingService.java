package study.design.patterns.singleton.example2;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 09/07/2023 20:47
 */
public class AmazingService {

    private final TreeMap<String, Integer> amazingValues = new TreeMap<>();

    private static class AmazingServiceHelper {
        private static final AmazingService INSTANCE = new AmazingService();
    }

    private AmazingService() {
    }

    /**
     *
     * Advantages:
     * The instance is created only at the first call of the getInstance() method.
     * This implementation is thread-safe.
     *
     * @return instance of GreatService
     */
    public static AmazingService getInstance() {
        System.out.println("Uses existent instance");
        return AmazingServiceHelper.INSTANCE;
    }

    public Integer putAmazingValue(String key, Integer value) {
        return amazingValues.put(key, value);
    }

    public Map.Entry<String, Integer> fetchLastAmazing() {
        return amazingValues.lastEntry();
    }

    public Map.Entry<String, Integer> fetchFirstAmazing() {
        return amazingValues.firstEntry();
    }

    public int sizeAmazing() {
        return amazingValues.size();
    }

    public void deleteAllAmazing() {
        amazingValues.clear();
    }
}
