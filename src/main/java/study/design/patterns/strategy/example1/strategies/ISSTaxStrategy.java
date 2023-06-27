package study.design.patterns.strategy.example1.strategies;

import study.design.patterns.strategy.example1.model.Budget;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:11
 */
public class ISSTaxStrategy implements TaxStrategy {

    public BigDecimal calculate(Budget budget) {
        return budget.amount().multiply(BigDecimal.valueOf(0.06));
    }
}
