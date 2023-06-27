package study.design.patterns.chainofresponsability.example2.chain;

import study.design.patterns.chainofresponsability.example2.model.Account;
import study.design.patterns.chainofresponsability.example2.model.Format;
import study.design.patterns.chainofresponsability.example2.model.Request;

import static java.util.Objects.nonNull;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:01
 */
public class ResponseCSVChain implements ResponseChain {

    private ResponseChain next;

    public String response(Request req, Account account) {

        if (!Format.CSV.equals(req.format())) {
            return nonNull(this.next) ? this.next.response(req, account) : "";
        }

        return account.getHolder() + "," + account.getBalance();
    }

    public void setNext(ResponseChain response) {
        this.next = response;
    }
}
