package study.design.patterns.decorator.example1;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:43
 */
@RequiredArgsConstructor
public class DataSourceDecorator implements DataSource{

    private final DataSource wrapper;

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
