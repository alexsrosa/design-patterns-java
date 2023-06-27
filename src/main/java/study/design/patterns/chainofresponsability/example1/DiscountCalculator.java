package study.design.patterns.chainofresponsability.example1;

import lombok.experimental.UtilityClass;
import study.design.patterns.chainofresponsability.example1.chain.DiscountByMarriedSaleChain;
import study.design.patterns.chainofresponsability.example1.chain.DiscountChain;
import study.design.patterns.chainofresponsability.example1.chain.DiscountForMoreThanFiveHundredChain;
import study.design.patterns.chainofresponsability.example1.chain.DiscountForMoreThanFiveItemsChain;
import study.design.patterns.chainofresponsability.example1.chain.NoDiscountChain;
import study.design.patterns.chainofresponsability.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:06
 */
@UtilityClass
public class DiscountCalculator {

    public BigDecimal calculator(Budget budget) {
        DiscountChain d1 = new DiscountForMoreThanFiveItemsChain();
        DiscountChain d2 = new DiscountForMoreThanFiveHundredChain();
        DiscountChain d3 = new DiscountByMarriedSaleChain();
        DiscountChain dEnd = new NoDiscountChain();

        d1.setNext(d2);
        d2.setNext(d3);
        d3.setNext(dEnd);

        return d1.toDiscount(budget);
    }
}
