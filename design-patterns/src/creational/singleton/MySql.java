package creational.singleton;

public class MySql implements DatabaseClient {

    @Override
    public String  connect() {

        return "Connecting to MySql";
    }
}