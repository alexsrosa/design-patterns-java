package com.design.patterns.chainofresponsability.example2;

public class ResponseCSV implements Response {

    private Response next;

    public String response(Request req, Account account) {

        if (!req.getFormat().equals(Format.CSV))
            return this.next.response(req,account);

        return account.getHolder()+ ","+ account.getBalance();
    }

    public void setNext(Response response) {
        this.next = response;
    }
}
