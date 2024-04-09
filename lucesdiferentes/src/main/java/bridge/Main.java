package bridge;

public class Main {
    public static void main(String[] args) {
        LuzLed luzLed = new LuzLed();
        LuzIncandecente  luzIncandecente = new LuzIncandecente ();

        PhysicalSwitch physicalSwitch = new PhysicalSwitch(luzLed);
        MobileAppSwitch mobileAppSwitch = new MobileAppSwitch(luzIncandecente );

        physicalSwitch.turnOnLight();
        mobileAppSwitch.turnOffLight();
    }
}