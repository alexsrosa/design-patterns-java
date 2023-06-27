package study.design.patterns.chainofresponsability.example1.chain;

import study.design.patterns.chainofresponsability.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:06
 */
public class DiscountForMoreThanFiveHundredChain implements DiscountChain {

    private DiscountChain next;

    public BigDecimal toDiscount(Budget budget) {
        if (budget.getAmount().compareTo(BigDecimal.valueOf(500)) > 0) {
            return budget.getAmount().multiply(BigDecimal.valueOf(0.07));
        } else {
            return this.next.toDiscount(budget);
        }
    }

    public void setNext(DiscountChain discountChain) {
        this.next = discountChain;
    }
}
