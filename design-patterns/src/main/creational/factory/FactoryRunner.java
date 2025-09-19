package creational.factory;

public class FactoryRunner {
    public static void main(String[] args) {
        GameFactory xboxFactory = new XboxFactory();
        Game xbox = xboxFactory.createGame();
        System.out.println(xbox.playingConsole());

        GameFactory playStationFactory = new PlayStationFactory();
        Game playStation = playStationFactory.createGame();
        System.out.println(playStation.playingConsole());

        GameFactory NintendoFactory = new NintendoFactory();
        Game Nintendo = NintendoFactory.createGame();
        System.out.println(Nintendo.playingConsole());

    }
}
