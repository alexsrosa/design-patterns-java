package study.design.patterns.decorator.example1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DecoratorExecution {

    public void exec(){

        String data = "some_string;another_string";

        FileDataSource source = new FileDataSource("some_file.csv");
        source.writeData(data);

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(source);
        encryptionDecorator.writeData(data);
        encryptionDecorator.readData();

        System.out.println();

        CompressionDecorator compressionDecorator = new CompressionDecorator(source);
        compressionDecorator.writeData(data);
        compressionDecorator.readData();
    }
}
