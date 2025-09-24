package Sem;

// Switch.java
public class Switch {
    private LightBulb bulb = new LightBulb();

    public void operate(boolean on) {
        if (on) bulb.turnOn();
        else bulb.turnOff();
    }
}

