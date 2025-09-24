package Sem;

// Robot.java
public class Robot implements Worker {
    public void work() {
        System.out.println("Robô trabalhando...");
    }
    public void eat() {
        // Não faz sentido!
        throw new UnsupportedOperationException("Robôs não comem!");
    }
}

