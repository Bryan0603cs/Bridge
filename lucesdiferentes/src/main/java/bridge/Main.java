package bridge;

public class Main {
    public static void main(String[] args) {
        LEDLight ledLight = new LEDLight();
        LuzIncandecente  luzIncandecente = new LuzIncandecente ();

        PhysicalSwitch physicalSwitch = new PhysicalSwitch(ledLight);
        MobileAppSwitch mobileAppSwitch = new MobileAppSwitch(luzIncandecente );

        physicalSwitch.turnOnLight();
        mobileAppSwitch.turnOffLight();
    }
}