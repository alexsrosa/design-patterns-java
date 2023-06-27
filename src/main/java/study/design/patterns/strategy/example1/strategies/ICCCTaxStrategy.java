package study.design.patterns.strategy.example1.strategies;

import study.design.patterns.strategy.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:11
 */
public class ICCCTaxStrategy implements TaxStrategy {

    public BigDecimal calculate(Budget budget) {

        if (budget.amount().compareTo(BigDecimal.valueOf(1000)) < 0) {
            return budget.amount().multiply(BigDecimal.valueOf(0.05));
        } else if (budget.amount().compareTo(BigDecimal.valueOf(1000)) >= 0
                && budget.amount().compareTo(BigDecimal.valueOf(3000)) <= 0) {
            return budget.amount().multiply(BigDecimal.valueOf(0.07));
        } else {
            return budget.amount().multiply(BigDecimal.valueOf(0.08)).add(BigDecimal.valueOf(30));
        }
    }
}
