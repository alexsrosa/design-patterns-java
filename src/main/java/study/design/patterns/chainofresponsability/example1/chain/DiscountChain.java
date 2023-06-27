package study.design.patterns.chainofresponsability.example1.chain;

import study.design.patterns.chainofresponsability.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:05
 */
public interface DiscountChain {

    BigDecimal toDiscount(Budget budget);

    void setNext(DiscountChain discountChain);
}
