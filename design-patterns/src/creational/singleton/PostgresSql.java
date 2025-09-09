package creational.singleton;

public class PostgresSql implements DatabaseClient {

    @Override
    public String  connect() {

        return "Connecting to PostgreSQL";
    }
}