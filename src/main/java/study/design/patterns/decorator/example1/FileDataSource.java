package study.design.patterns.decorator.example1;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 28/06/2023 20:37
 */
@RequiredArgsConstructor
public class FileDataSource implements DataSource {

    private final String filename;

    private final StringBuilder savedData = new StringBuilder();

    @Override
    public void writeData(String data) {
        String transformData = String.format("%s", data);
        savedData.append(transformData);
        System.out.println(String.format("Filename: %s has the fallow data: %s", filename, transformData));
        System.out.println(this.readData());
    }

    @Override
    public String readData() {
        return savedData.toString();
    }
}
