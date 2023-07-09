package study.design.patterns.singleton.example1;

import java.util.Map;
import java.util.TreeMap;

import static java.util.Objects.isNull;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 07/07/2023 19:31
 */
public class GreatService {

    private static GreatService instance;

    private final TreeMap<String, Integer> greatValues = new TreeMap<>();

    private GreatService() {

    }

    /**
     *
     * Advantage:
     * This implementation is thread-safe.
     * Disadvantage:
     * It reduces the performance because of the cost associated with
     * the synchronized method. To avoid this extra overhead every time,
     * double-checked locking principle should be used.
     *
     * @return instance of GreatService
     */
    public static synchronized GreatService getInstance() {
        if (isNull(instance)) {
            instance = new GreatService();
            System.out.println("Create a new instance");
            return instance;
        }

        System.out.println("Uses existent instance");
        return instance;
    }

    public Integer putGreatValue(String key, Integer value) {
        return greatValues.put(key, value);
    }

    public Map.Entry<String, Integer> fetchLastGreat() {
        return greatValues.lastEntry();
    }

    public Map.Entry<String, Integer> fetchFirstGreat() {
        return greatValues.firstEntry();
    }

    public int sizeGreat() {
        return greatValues.size();
    }

    public void deleteAllGreat() {
        greatValues.clear();
    }
}
