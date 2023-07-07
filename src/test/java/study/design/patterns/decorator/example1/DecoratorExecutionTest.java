package study.design.patterns.decorator.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:58
 */
class DecoratorExecutionTest {

    @Test
    void Given_DiscoveryDiscount_When_SimpleNoDiscount_Then_ReturnDiscountZero() {

        String data = "something";

        FileDataSource source = new FileDataSource("some_file.csv");
        source.writeData(data);
        assertEquals("something", source.readData());

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(source);
        encryptionDecorator.writeData(data);
        assertEquals("something*encrypted[something]", encryptionDecorator.readData());

        CompressionDecorator compressionDecorator = new CompressionDecorator(source);
        compressionDecorator.writeData(data);
        assertEquals("something*encrypted[something]*compression[something]", encryptionDecorator.readData());
    }

}