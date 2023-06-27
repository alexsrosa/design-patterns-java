package study.design.patterns.strategy.example2.model;

import lombok.Getter;

import java.math.BigDecimal;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 26/06/2023 14:27
 */
public class Account {

    @Getter
    private BigDecimal balance;

    public Account() {
        balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal value) {
        balance = balance.add(value);
    }
}
