package com.design.patterns.chainofresponsability.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {

    private DiscountCalculator discountCalculator;

    @BeforeEach
    public void beforeAll(){
        discountCalculator = new DiscountCalculator();
    }

    @Test
    public void discountTestSimple(){

        Budget budget = new Budget(500.00);
        budget.addItem(new Item("Memory", 250.00));
        budget.addItem(new Item("Hard Disk", 250.00));

        double discount = discountCalculator.calculator(budget);

        System.out.println(discount);

        assertEquals(discount, 0);
    }

    @Test
    public void discountTestWithByMarriedSale(){

        Budget budget = new Budget(10.00);
        budget.addItem(new Item("PENCIL", 5.00));
        budget.addItem(new Item("PEN", 5.00));

        double discount = discountCalculator.calculator(budget);

        System.out.println(discount);

        assertEquals(discount, 0.5);
    }

}
