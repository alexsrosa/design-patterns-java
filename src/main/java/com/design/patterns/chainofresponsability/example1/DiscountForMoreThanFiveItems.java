package com.design.patterns.chainofresponsability.example1;

public class DiscountForMoreThanFiveItems implements Discount {

    private Discount next;

    public double toDiscount(Budget budget) {
        if(budget.getItems().size() > 5){
            return budget.getValue() * 0.1;
        }else{
            return next.toDiscount(budget);
        }
    }

    public void setNext(Discount discount) {
        this.next = discount;
    }
}
