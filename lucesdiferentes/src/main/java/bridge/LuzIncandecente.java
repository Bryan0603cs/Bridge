package bridge;


public class LuzIncandecente implements Luz {
    public void turnOn() {
        System.out.println("Luz incandescente encendida");
    }

    public void turnOff() {
        System.out.println("Luz incandescente apagada");
    }

    public void setBrillo(int brillo) {
        System.out.println("Brillo de la luz incandescente ajustado a " + brillo);
    }
}