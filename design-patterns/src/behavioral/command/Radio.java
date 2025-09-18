package behavioral.command;

public class Radio implements Device {

    @Override
    public void turnOn() {

        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {

        System.out.println("TV turned off");
    }

    public void adjustVolume() {
        System.out.println("Adjusting radio volume");
    }
}
