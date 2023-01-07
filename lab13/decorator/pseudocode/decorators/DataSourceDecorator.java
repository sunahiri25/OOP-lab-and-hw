package decorator.pseudocode.decorators;

import decorator.pseudocode.datasource.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
