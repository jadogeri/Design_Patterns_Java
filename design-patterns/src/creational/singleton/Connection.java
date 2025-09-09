package creational.singleton;

public class Connection {

    private static Connection database;
    private  static DatabaseClient client;

    private Connection() {}

    public static Connection getInstance() {
        if (database == null) {
            database = new Connection();
        }
        return database;
    }

    public static void registerDatabase(DatabaseClient databaseClient) {
        client = databaseClient;
    }

    public static String connectDatabase() {
        if (client == null) {
            client = new MemoryDatabase();
        }
        return client.connect();
    }

    private static class MemoryDatabase implements DatabaseClient {

        @Override
        public String connect() {
            return "Memory Database";
        }
    }


}
