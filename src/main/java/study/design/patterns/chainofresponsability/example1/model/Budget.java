package study.design.patterns.chainofresponsability.example1.model;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:05
 */
public class Budget {

    @Getter
    private final BigDecimal amount;

    private final List<Item> items;

    public Budget(BigDecimal value) {
        this.amount = value;
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
