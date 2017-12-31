package com.design.patterns.chainofresponsability.example1;

public class DiscountCalculator {

    public double calculator(Budget budget) {
        Discount d1 = new DiscountForMoreThanFiveItems ();
        Discount d2 = new DiscountForMoreThanFiveHundred();
        Discount d3 = new DiscountByMarriedSale();
        Discount dFim = new NoDiscount();

        d1.setNext(d2);
        d2.setNext(d3);
        d3.setNext(dFim);

        return d1.toDiscount(budget);
    }
}
