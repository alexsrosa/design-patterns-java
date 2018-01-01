package com.design.patterns.chainofresponsability.example2;

import com.thoughtworks.xstream.XStream;

public class ResponseXML implements Response {

    private Response next;

    public String response(Request req, Account account) {

        if(!req.getFormat().equals(Format.XML))
            return this.next != null ? this.next.response(req, account) : "";

        return new XStream().toXML(account);
    }

    public void setNext(Response response) {
        this.next = response;
    }
}
