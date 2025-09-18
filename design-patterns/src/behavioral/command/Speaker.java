package behavioral.command;

public class Speaker implements Device {

    @Override
    public void turnOn() {

        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {

        System.out.println("TV turned off");
    }
}
