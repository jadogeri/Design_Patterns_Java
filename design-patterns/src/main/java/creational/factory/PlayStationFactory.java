package creational.factory;

public class PlayStationFactory implements GameFactory {

    @Override
    public Game createGame() {
        return new PlayStation();
    }
}
