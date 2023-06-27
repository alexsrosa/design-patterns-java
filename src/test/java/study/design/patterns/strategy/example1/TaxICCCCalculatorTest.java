package study.design.patterns.strategy.example1;

import org.junit.jupiter.api.Test;
import study.design.patterns.strategy.example1.model.Budget;
import study.design.patterns.strategy.example1.strategies.ICCCTaxStrategy;
import study.design.patterns.strategy.example1.strategies.ISSTaxStrategy;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:16
 */
class TaxICCCCalculatorTest {

    @Test
    void Given_CalculateTax_When_TaxIsICCCLessThan1000_Then_ReturnsCorrectlyTax() {

        BigDecimal calculated859 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(859)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(42.95).compareTo(calculated859));

        BigDecimal calculated999 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(999)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(49.95).compareTo(calculated999));
    }

    @Test
    void Given_CalculateTax_When_TaxIsICCCEqualOrMoreThan1000AndEqualOrLessThan3000_Then_ReturnsCorrectlyTax() {

        BigDecimal calculated1000 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(1000)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(70).compareTo(calculated1000));

        BigDecimal calculated1859 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(1859)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(130.13).compareTo(calculated1859));

        BigDecimal calculated2500 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(2500)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(175).compareTo(calculated2500));

        BigDecimal calculated3000 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(3000)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(210).compareTo(calculated3000));
    }

    @Test
    void Given_CalculateTax_When_TaxIsICCCMoreThan3000_Then_ReturnsCorrectlyTax() {

        BigDecimal calculated3000 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(3001)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(270.08).compareTo(calculated3000));

        BigDecimal calculated3659 = TaxCalculator.calculate(new Budget(BigDecimal.valueOf(3659)), new ICCCTaxStrategy());
        assertEquals(0, BigDecimal.valueOf(322.72).compareTo(calculated3659));
    }

}