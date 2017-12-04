package com.design.patterns.strategy.example2;

public class Conservative implements Investment {

    public Double returnOnInvestment(Account account) {
        return account.getBalance() * 0.008;
    }
}
