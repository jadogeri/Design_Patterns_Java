package creational.factory;

public class NintendoFactory implements GameFactory {

    @Override
    public Game createGame() {

        return new Nintendo();
    }
}
