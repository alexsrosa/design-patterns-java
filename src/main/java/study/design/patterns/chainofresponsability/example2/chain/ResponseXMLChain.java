package study.design.patterns.chainofresponsability.example2.chain;

import com.thoughtworks.xstream.XStream;
import study.design.patterns.chainofresponsability.example2.model.Account;
import study.design.patterns.chainofresponsability.example2.model.Format;
import study.design.patterns.chainofresponsability.example2.model.Request;

import static java.util.Objects.nonNull;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 25/06/2023 13:01
 */
public class ResponseXMLChain implements ResponseChain {

    private ResponseChain next;

    public String response(Request req, Account account) {

        if (!Format.XML.equals(req.format())) {
            return nonNull(this.next) ? this.next.response(req, account) : "";
        }

        return new XStream().toXML(account);
    }

    public void setNext(ResponseChain response) {
        this.next = response;
    }
}
