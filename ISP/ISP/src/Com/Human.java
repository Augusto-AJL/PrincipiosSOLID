package Com;

// Human.java
public class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Humano trabalhando...");
    }
    public void eat() {
        System.out.println("Humano comendo...");
    }
}

