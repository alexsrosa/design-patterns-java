package study.design.patterns.chainofresponsability.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.design.patterns.chainofresponsability.example2.model.Account;
import study.design.patterns.chainofresponsability.example2.model.Format;
import study.design.patterns.chainofresponsability.example2.model.Request;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 26/06/2023 08:48
 */
class ConverterProcessorTest {

    private Account account;

    @BeforeEach
    void init() {
        account = new Account();
        account.setHolder("holder for the account");
        account.setBalance(2000.00);
    }

    @Test
    void Given_ConvertToXml_When_ReceiveAccountObject_ThenConvertToXML() {
        Request request = new Request(Format.XML);
        String run = ConverterProcessor.run(request, account);
        assertEquals(run, "<study.design.patterns.chainofresponsability.example2.model.Account>\n" +
                "  <holder>holder for the account</holder>\n" +
                "  <balance>2000.0</balance>\n" +
                "</study.design.patterns.chainofresponsability.example2.model.Account>");
    }

    @Test
    void Given_ConvertToCSV_When_ReceiveAccountObject_ThenConvertToCSV() {
        Request request = new Request(Format.CSV);
        String run = ConverterProcessor.run(request, account);
        assertEquals("holder for the account,2000.0", run);
    }

    @Test
    void Given_ConvertToPercent_When_ReceiveAccountObject_ThenConvertToPercent() {

        Request request = new Request(Format.PERCENT);
        String run = ConverterProcessor.run(request, account);
        assertEquals("holder for the account%2000.0", run);
    }

    @Test
    void Given_ConvertToNone_When_ReceiveAccountObject_ThenConvertToNone() {

        Request request = new Request(Format.NONE);
        String run = ConverterProcessor.run(request, account);
        System.out.println(run);
        assertEquals("", run);
    }
}