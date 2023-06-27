package study.design.patterns.chainofresponsability.example2;

import lombok.experimental.UtilityClass;
import study.design.patterns.chainofresponsability.example2.chain.ResponseCSVChain;
import study.design.patterns.chainofresponsability.example2.chain.ResponseChain;
import study.design.patterns.chainofresponsability.example2.chain.ResponsePercentChain;
import study.design.patterns.chainofresponsability.example2.chain.ResponseXMLChain;
import study.design.patterns.chainofresponsability.example2.model.Account;
import study.design.patterns.chainofresponsability.example2.model.Request;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:59
 */
@UtilityClass
public class ConverterProcessor {

    public String run(Request request, Account account) {

        ResponseChain responseXML = new ResponseXMLChain();
        ResponseChain responseCSV = new ResponseCSVChain();
        ResponseChain responsePercent = new ResponsePercentChain();

        responseXML.setNext(responseCSV);
        responseCSV.setNext(responsePercent);

        return responseXML.response(request, account);
    }
}
