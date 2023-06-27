package study.design.patterns.chainofresponsability.example1.chain;

import study.design.patterns.chainofresponsability.example1.model.Budget;
import study.design.patterns.chainofresponsability.example1.model.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:06
 */
public class DiscountByMarriedSaleChain implements DiscountChain {

    private DiscountChain next;

    public BigDecimal toDiscount(Budget budget) {

        List<String> listFindItems = new ArrayList<>();

        listFindItems.add("PEN");
        listFindItems.add("PENCIL");

        if (this.exist(listFindItems, budget.getItems())) {
            return budget.getAmount().multiply(BigDecimal.valueOf(0.05));
        } else {
            return next.toDiscount(budget);
        }
    }

    public void setNext(DiscountChain discountChain) {
        this.next = discountChain;
    }

    public boolean exist(List<String> listFindItems, List<Item> items) {
        for (Item item : items) {
            for (String findItem : listFindItems) {
                if (item.name().equals(findItem)) {
                    return true;
                }
            }
        }
        return false;
    }
}
