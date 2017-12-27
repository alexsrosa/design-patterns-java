package com.design.patterns.chainofresponsability.example1;

public class DiscountForMoreThanFiveHundred implements Discount {

    private Discount next;

    public double toDiscount(Budget budget) {

        if(budget.getValue() > 500){
            return budget.getValue() * 0.07;
        }else{
            return this.next.toDiscount(budget);
        }
    }

    public void setNext(Discount discount) {
        this.next = discount;
    }
}
