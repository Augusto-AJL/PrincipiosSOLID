package Com;

// Main.java
public class Main {
    public static void main(String[] args) {
        Switch s1 = new Switch(new LightBulb());
        s1.operate(true);
        s1.operate(false);

        Switch s2 = new Switch(new Fan());
        s2.operate(true);
        s2.operate(false);
    }
}
