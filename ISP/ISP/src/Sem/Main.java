package Sem;

// Main.java
public class Main {
    public static void main(String[] args) {
        Worker humano = new Human();
        Worker robo = new Robot();

        humano.work();
        humano.eat();
        humano.sleep();
        humano.getPaid();

        robo.work();
        robo.eat();     // métodos inúteis
        robo.sleep();   // métodos inúteis
        robo.getPaid(); // métodos inúteis
    }
}

