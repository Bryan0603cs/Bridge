package bridge;

public class PhysicalSwitch implements Switch {
    private Luz luz;

    public PhysicalSwitch(Luz luz) {
        this.luz = luz;
    }

    public void turnOnLight() {
        luz.turnOn();
    }

    public void turnOffLight() {
        luz.turnOff();
    }
}
