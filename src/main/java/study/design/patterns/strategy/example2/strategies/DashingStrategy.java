package study.design.patterns.strategy.example2.strategies;

import study.design.patterns.strategy.example2.model.Account;

import java.math.BigDecimal;
import java.util.Random;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 26/06/2023 14:29
 */
public class DashingStrategy implements InvestmentStrategy {

    private final Random random;

    public DashingStrategy() {
        this.random = new Random();
    }

    public BigDecimal returnOnInvestment(Account account) {
        int randomValue = random.nextInt(10);

        if (randomValue <= 1) {
            return account.getBalance().multiply(BigDecimal.valueOf(0.05));
        } else if (randomValue <= 4) {
            return account.getBalance().multiply(BigDecimal.valueOf(0.03));
        } else {
            return account.getBalance().multiply(BigDecimal.valueOf(0.006));
        }
    }
}
