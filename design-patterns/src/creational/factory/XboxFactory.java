package creational.factory;

public class XboxFactory implements GameFactory {

    @Override
    public Game createGame() {

        return new Xbox();
    }
}
