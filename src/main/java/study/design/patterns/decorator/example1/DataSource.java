package study.design.patterns.decorator.example1;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:35
 */
public interface DataSource {

    void writeData(String data);
    String readData();
}
