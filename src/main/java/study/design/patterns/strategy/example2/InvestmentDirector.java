package study.design.patterns.strategy.example2;

import lombok.experimental.UtilityClass;
import study.design.patterns.strategy.example2.model.Account;
import study.design.patterns.strategy.example2.strategies.InvestmentStrategy;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 27/06/2023 17:20
 */
@UtilityClass
public class InvestmentDirector {

    public void realize(Account account, InvestmentStrategy investment) {
        BigDecimal result = investment.returnOnInvestment(account);
        account.deposit(result);
    }
}
