package com.design.patterns.chainofresponsability.example2;

public class ResponsePercent implements Response {

    private Response next;

    public String response(Request req, Account account) {

        if(!req.getFormat().equals(Format.PERCENT))
            return this.next != null ? this.next.response(req, account) : "";

        return account.getHolder() + "%" + account.getBalance();
    }

    public void setNext(Response response) {
        this.next = response;
    }
}
