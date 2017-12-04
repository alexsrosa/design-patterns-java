package com.design.patterns.strategy.example2;

public class Account {

    private double balance;


    public void deposit(double value) {
        this.balance += value;
    }

    public double getBalance() {
        return this.balance;
    }
}
