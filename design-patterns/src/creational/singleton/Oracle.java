package creational.singleton;

public class Oracle implements DatabaseClient {

    @Override
    public String  connect() {

        return "Connecting to Oracle";
    }
}
