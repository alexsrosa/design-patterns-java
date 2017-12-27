package com.design.patterns.chainofresponsability.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountTest {

    @Test
    public void discountTest(){

        DiscountCalculator discountCalculator = new DiscountCalculator();

        Budget budget = new Budget(500.00);
        budget.addItem(new Item("Memory", 250.00));
        budget.addItem(new Item("Hard Disk", 250.00));

        double discount = discountCalculator.calculator(budget);

        System.out.println(discount);

        assertEquals(discount, 0);
    }

}
