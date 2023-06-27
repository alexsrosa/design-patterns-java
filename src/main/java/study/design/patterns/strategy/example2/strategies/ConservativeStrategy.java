package study.design.patterns.strategy.example2.strategies;

import study.design.patterns.strategy.example2.model.Account;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 26/06/2023 14:29
 */
public class ConservativeStrategy implements InvestmentStrategy {

    public BigDecimal returnOnInvestment(Account account) {
        return account.getBalance().multiply(BigDecimal.valueOf(0.008));
    }
}
