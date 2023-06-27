package study.design.patterns.strategy.example2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import study.design.patterns.strategy.example2.model.Account;
import study.design.patterns.strategy.example2.strategies.ConservativeStrategy;
import study.design.patterns.strategy.example2.strategies.DashingStrategy;
import study.design.patterns.strategy.example2.strategies.ModerateStrategy;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:24
 */
class InvestmentDirectorTest {

    @Test
    void Given_InvestmentConservative_When_Deposit1000WithConservativeStrategy_Then_GetBalanceIsCorrectly() {
        Account account = new Account();
        BigDecimal value = BigDecimal.valueOf(1000);
        account.deposit(value);

        InvestmentDirector.realize(account, new ConservativeStrategy());

        assertEquals(0, account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.008)).add(value)));
    }

    @Test
    void Given_InvestmentConservative_When_Deposit1000WithDashingStrategy_Then_GetBalanceIsCorrectly() {
        Account account = new Account();
        BigDecimal value = BigDecimal.valueOf(1000);
        account.deposit(value);

        InvestmentDirector.realize(account, new DashingStrategy());

        int optionOne = account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.05)).add(value));
        int optionTwo = account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.03)).add(value));
        int optionThird = account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.006)).add(value));

        boolean isValidAmount = account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.05)).add(value)) == 0
                || account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.03)).add(value)) == 0
                || account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.006)).add(value)) == 0;

        assertTrue(isValidAmount);
    }

    @Test
    void Given_InvestmentConservative_When_Deposit1000WithModerateStrategy_Then_GetBalanceIsCorrectly() {
        Account account = new Account();
        BigDecimal value = BigDecimal.valueOf(1000);
        account.deposit(value);

        InvestmentDirector.realize(account, new ModerateStrategy());


        boolean isValidAmount = account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.025)).add(value)) == 0
                || account.getBalance().compareTo(value.multiply(BigDecimal.valueOf(0.007)).add(value)) == 0;

        assertTrue(isValidAmount);
    }
}