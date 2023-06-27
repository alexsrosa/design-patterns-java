package study.design.patterns.chainofresponsability.example1.chain;

import study.design.patterns.chainofresponsability.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:54
 */
public class NoDiscountChain implements DiscountChain {

    public BigDecimal toDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void setNext(DiscountChain discountChain) {
        // this business represents that not have discount
    }
}
