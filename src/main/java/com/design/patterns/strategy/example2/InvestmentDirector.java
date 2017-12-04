package com.design.patterns.strategy.example2;

public class InvestmentDirector {

    public void realize(Account account, Investment investment) {
        double result = investment.returnOnInvestment(account);
        account.deposit( result * 0.75 );
    }
}
