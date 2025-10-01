package Com;

// Main.java
public class Main {
    public static void main(String[] args) {
        Workable h = new Human();
        h.work();
        
        Eatable e = new Human();
        e.eat();

        Sleepable s = new Human();
        s.sleep();

        Payable p = new Human();
        p.getPaid();

        Workable r = new Robot();
        r.work();
    }
}

