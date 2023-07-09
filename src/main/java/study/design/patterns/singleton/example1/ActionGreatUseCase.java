package study.design.patterns.singleton.example1;

import java.util.Map;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 07/07/2023 19:35
 */
public class ActionGreatUseCase {

    public Map.Entry<String, Integer> fetchLastGreat() {
        return GreatService.getInstance().fetchLastGreat();
    }

    public Integer putGreatValue(String key, Integer value) {
        return GreatService.getInstance().putGreatValue(key, value);
    }

    public Integer sizeGreat() {
        return GreatService.getInstance().sizeGreat();
    }

    public void deleteAllGreat(){
        GreatService.getInstance().deleteAllGreat();
    }
}
