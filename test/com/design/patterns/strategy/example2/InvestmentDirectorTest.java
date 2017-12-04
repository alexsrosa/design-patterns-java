package com.design.patterns.strategy.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvestmentDirectorTest {

    @Test
    public void investmentConservativeTest(){
        Account account = new Account();
        double value = 1000;
        account.deposit(value);

        Investment investment = new Conservative();
        InvestmentDirector investmentDirector = new InvestmentDirector();

        investmentDirector.realize(account,investment);

        assertEquals(account.getBalance(), ((value * 0.008)* 0.75) + value);
    }

}
