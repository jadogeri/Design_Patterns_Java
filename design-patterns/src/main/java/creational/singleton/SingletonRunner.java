package creational.singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        

        DatabaseClient mysql = new MySql();
        DatabaseClient oracle = new Oracle();
        DatabaseClient postgresql = new PostgresSql();
        DatabaseClient mongodb = new MongoDB();

        //create connection instance
        Connection database = Connection.getInstance();
        System.out.println(database.getInstance());
        System.out.println(database.getInstance());
        System.out.println(database.getInstance());

        //if no database is provided, application uses memory
        System.out.println(database.connectDatabase());

        database.registerDatabase(mysql);
        System.out.println(database.connectDatabase());
        database.registerDatabase(postgresql);
        System.out.println(database.connectDatabase());
        database.registerDatabase(oracle);
        System.out.println(database.connectDatabase());
        database.registerDatabase(mongodb);
        System.out.println(database.connectDatabase());
    }
}