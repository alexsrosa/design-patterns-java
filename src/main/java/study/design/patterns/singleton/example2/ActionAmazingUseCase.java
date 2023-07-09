package study.design.patterns.singleton.example2;

import java.util.Map;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 07/07/2023 19:35
 */
public class ActionAmazingUseCase {

    public Map.Entry<String, Integer> fetchLastAmazing() {
        return AmazingService.getInstance().fetchLastAmazing();
    }

    public Integer putAmazingValue(String key, Integer value) {
        return AmazingService.getInstance().putAmazingValue(key, value);
    }

    public Integer sizeAmazing() {
        return AmazingService.getInstance().sizeAmazing();
    }

    public void deleteAllAmazing(){
        AmazingService.getInstance().deleteAllAmazing();
    }
}
