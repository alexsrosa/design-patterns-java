package study.design.patterns.strategy.example1;

import lombok.experimental.UtilityClass;
import study.design.patterns.strategy.example1.model.Budget;
import study.design.patterns.strategy.example1.strategies.TaxStrategy;

import java.math.BigDecimal;

@UtilityClass
public class TaxCalculator {

    public BigDecimal calculate(Budget budget, TaxStrategy taxStrategy) {
        return taxStrategy.calculate(budget);
    }
}
