package bridge;

public class LEDLight implements Luz {
    public void turnOn() {
        System.out.println("Luz LED encendida");
    }

    public void turnOff() {
        System.out.println("Luz LED apagada");
    }

    public void setBrillo(int brillo) {
        System.out.println("Brillo de la luz LED ajustado a" + brillo);
    }
}
