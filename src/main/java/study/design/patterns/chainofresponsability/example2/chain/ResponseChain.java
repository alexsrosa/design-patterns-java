package study.design.patterns.chainofresponsability.example2.chain;

import study.design.patterns.chainofresponsability.example2.model.Account;
import study.design.patterns.chainofresponsability.example2.model.Request;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 12:59
 */
public interface ResponseChain {

    String response(Request request, Account account);

    void setNext(ResponseChain response);
}
