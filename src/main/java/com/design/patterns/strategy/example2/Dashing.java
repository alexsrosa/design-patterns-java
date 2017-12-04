package com.design.patterns.strategy.example2;

import java.util.Random;

public class Dashing implements Investment {

    private Random random;

    public Dashing() {
        this.random = new Random();
    }

    public Double returnOnInvestment(Account account) {
        int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1) return account.getBalance() * 0.05;
        else if (chute >= 2 && chute <= 4) return account.getBalance() * 0.03;
        else return account.getBalance() * 0.006;
    }
}
