package com.design.patterns.chainofresponsability.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    private Account account;

    @BeforeEach
    public void beforeEach(){

        account = new Account();
        account.setHolder("holder for the account");
        account.setBalance(2000.00);
    }

    @Test
    public void convertToXmlTest(){

        Request request = new Request(Format.XML);
        String run = Converter.run(request,account);
        assertEquals(run, "<com.design.patterns.chainofresponsability.example2.Account>\n" +
                "  <holder>holder for the account</holder>\n" +
                "  <balance>2000.0</balance>\n" +
                "</com.design.patterns.chainofresponsability.example2.Account>");
    }

    @Test
    public void convertToCSVTest(){

        Request request = new Request(Format.CSV);
        String run = Converter.run(request,account);
        assertEquals(run, "holder for the account,2000.0");
    }

    @Test
    public void convertToPercentTest(){

        Request request = new Request(Format.PERCENT);
        String run = Converter.run(request,account);
        assertEquals(run, "holder for the account%2000.0");
    }

    @Test
    public void convertToNoneTest(){

        Request request = new Request(Format.NONE);
        String run = Converter.run(request,account);
        System.out.println(run);
        assertEquals(run, "");
    }

}
