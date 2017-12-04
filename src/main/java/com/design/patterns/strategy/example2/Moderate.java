package com.design.patterns.strategy.example2;

import java.util.Random;

public class Moderate implements Investment {

    private Random random;

    public Moderate() {
        this.random = new Random();
    }

    public Double returnOnInvestment(Account account) {
        if(random.nextInt(2) == 0) return account.getBalance() * 0.025;
        else return account.getBalance() * 0.007;
    }
}
