package Com;

// Main.java
public class Main {
    public static void main(String[] args) {
        Workable h = new Human();
        Workable r = new Robot();

        h.work();
        r.work();

        Eatable e = new Human();
        e.eat();
    }
}

