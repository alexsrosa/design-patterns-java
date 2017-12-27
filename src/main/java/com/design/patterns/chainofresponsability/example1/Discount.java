package com.design.patterns.chainofresponsability.example1;

public interface Discount{

    double toDiscount(Budget budget);
    void setNext(Discount discount);
}
