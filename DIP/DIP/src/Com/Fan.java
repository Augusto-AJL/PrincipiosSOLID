package Com;

// Fan.java
public class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Ventilador ligado");
    }
    public void turnOff() {
        System.out.println("Ventilador desligado");
    }
}

