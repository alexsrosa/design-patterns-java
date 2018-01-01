package com.design.patterns.chainofresponsability.example2;

public class  Converter {

    public static String run(Request request, Account account){

        Response responseXML = new ResponseXML();
        Response responseCSV = new ResponseCSV();
        Response responsePercent = new ResponsePercent();

        responseXML.setNext(responseCSV);
        responseCSV.setNext(responsePercent);

        return responseXML.response(request, account) ;
    }
}
