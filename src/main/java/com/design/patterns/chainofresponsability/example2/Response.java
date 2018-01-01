package com.design.patterns.chainofresponsability.example2;

public interface Response {

    String response(Request request, Account account);
    void setNext(Response response);
}
