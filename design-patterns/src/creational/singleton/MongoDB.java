package creational.singleton;

public class MongoDB implements DatabaseClient {

    @Override
    public String  connect() {

        return "Connecting to MongoDB";
    }
}
