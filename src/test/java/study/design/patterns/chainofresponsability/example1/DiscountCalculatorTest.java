package study.design.patterns.chainofresponsability.example1;

import org.junit.jupiter.api.Test;
import study.design.patterns.chainofresponsability.example1.model.Budget;
import study.design.patterns.chainofresponsability.example1.model.Item;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:21
 */
class DiscountCalculatorTest {

    @Test
    void Given_DiscoveryDiscount_When_SimpleNoDiscount_Then_ReturnDiscountZero() {

        Budget budget = new Budget(BigDecimal.valueOf(500));
        budget.addItem(new Item("Memory", BigDecimal.valueOf(250)));
        budget.addItem(new Item("Hard Disk", BigDecimal.valueOf(250)));

        BigDecimal discount = DiscountCalculator.calculator(budget);
        assertEquals(BigDecimal.ZERO, discount);
    }

    @Test
    void Given_DiscoveryDiscount_When_SimpleDiscountWithByMarriedSale_Then_ReturnDiscount0_5() {

        Budget budget = new Budget(BigDecimal.valueOf(10));
        budget.addItem(new Item("PENCIL", BigDecimal.valueOf(5)));
        budget.addItem(new Item("PEN", BigDecimal.valueOf(5)));

        BigDecimal discount = DiscountCalculator.calculator(budget);

        assertEquals(0, BigDecimal.valueOf(0.5).compareTo(discount));
    }
}