package study.design.patterns.strategy.example2.strategies;

import study.design.patterns.strategy.example2.model.Account;
import study.design.patterns.strategy.example2.strategies.InvestmentStrategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 26/06/2023 14:35
 */
public class ModerateStrategy implements InvestmentStrategy {

    private final Random random;

    public ModerateStrategy() {
        this.random = new Random();
    }

    public BigDecimal returnOnInvestment(Account account) {
        return random.nextInt(2) == 0
                ? account.getBalance().multiply(BigDecimal.valueOf(0.025))
                : account.getBalance().multiply(BigDecimal.valueOf(0.007));
    }
}
