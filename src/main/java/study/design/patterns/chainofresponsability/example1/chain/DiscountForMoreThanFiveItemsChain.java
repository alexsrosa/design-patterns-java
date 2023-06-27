package study.design.patterns.chainofresponsability.example1.chain;

import study.design.patterns.chainofresponsability.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:06
 */
public class DiscountForMoreThanFiveItemsChain implements DiscountChain {

    private DiscountChain next;

    public BigDecimal toDiscount(Budget budget) {
        if (budget.getItems().size() > 5) {
            return budget.getAmount().multiply(BigDecimal.valueOf(0.1));
        } else {
            return next.toDiscount(budget);
        }
    }

    public void setNext(DiscountChain discountChain) {
        this.next = discountChain;
    }
}
