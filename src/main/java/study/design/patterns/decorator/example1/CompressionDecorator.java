package study.design.patterns.decorator.example1;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:52
 */
public class CompressionDecorator extends DataSourceDecorator{

    private final DataSource wrapper;

    public CompressionDecorator(DataSource wrapper) {
        super(wrapper);
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        String transformData = String.format("*compression[%s]", data);
        wrapper.writeData(transformData);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
