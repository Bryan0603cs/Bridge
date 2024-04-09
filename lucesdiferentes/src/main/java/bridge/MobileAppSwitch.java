package bridge;

public class MobileAppSwitch implements Switch {
    private Luz luz;

    public MobileAppSwitch(Luz luz) {
        this.luz = luz;
    }

    public void turnOnLight() {
        luz.turnOn();
    }

    public void turnOffLight() {
        luz.turnOff();
    }
}