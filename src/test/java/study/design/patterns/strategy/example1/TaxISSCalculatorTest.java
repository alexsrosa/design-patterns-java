package study.design.patterns.strategy.example1;

import org.junit.jupiter.api.Test;
import study.design.patterns.strategy.example1.model.Budget;
import study.design.patterns.strategy.example1.strategies.ISSTaxStrategy;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:16
 */
class TaxISSCalculatorTest {

    @Test
    void Given_CalculateTax_When_TaxIsISS_Then_ReturnsCorrectlyTax() {

        BigDecimal calculated1000 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(1000)), new ISSTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(60).compareTo(calculated1000));

        BigDecimal calculated5958 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(5958)), new ISSTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(357.48).compareTo(calculated5958));
    }
}