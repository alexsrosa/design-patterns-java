package com.design.patterns.chainofresponsability.example1;

public class NoDiscount implements Discount {

    public double toDiscount(Budget budget) {
        return 0;
    }

    public void setNext(Discount discount) {
    }
}
