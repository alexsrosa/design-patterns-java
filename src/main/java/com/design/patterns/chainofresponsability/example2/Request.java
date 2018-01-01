package com.design.patterns.chainofresponsability.example2;

public class Request {

    private Format format;

    public Request(Format format){
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }
}
