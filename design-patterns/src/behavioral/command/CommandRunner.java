package behavioral.command;

public class CommandRunner {

    public static void main(String[] args) {
        // Create devices
        Television tv = new Television();
        Radio radio = new Radio();
        Light light = new Light();

        // Create command objects
        Command turnOnTvCommand = new TurnOnCommand(tv);
        Command turnOffTvCommand = new TurnOffCommand(tv);
        Command turnOnRadioCommand = new TurnOnCommand(radio);
        Command turnOffRadioCommand = new TurnOffCommand(radio);
        Command turnOnLightCommand = new TurnOnCommand(light);
        Command turnOffLightCommand = new TurnOffCommand(light);
        Command adjustVolumeRadioCommand = new AdjustVolumeCommand(radio);
        Command changeChannelTvCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTvCommand);
        remote.pressButton();  // Outputs: TV is now on
        remote.setCommand(adjustVolumeRadioCommand);
        remote.pressButton();  // Outputs: Volume adjusted

        remote.setCommand(changeChannelTvCommand);
        remote.pressButton();  // Outputs: Channel changed

        remote.setCommand(turnOffTvCommand);
        remote.pressButton();  // Outputs: TV is now off

    }
}
