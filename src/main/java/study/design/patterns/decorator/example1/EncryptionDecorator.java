package study.design.patterns.decorator.example1;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:47
 */
public class EncryptionDecorator extends DataSourceDecorator{

    private final DataSource wrapper;

    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        String transformData = String.format("*encrypted[%s]", data);
        wrapper.writeData(transformData);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
