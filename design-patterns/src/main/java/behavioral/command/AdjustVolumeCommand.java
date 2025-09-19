package behavioral.command;

// Concrete command for adjusting the volume of a stereo
public class AdjustVolumeCommand implements Command {
    private Radio radio;

    public AdjustVolumeCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.adjustVolume();
    }
}