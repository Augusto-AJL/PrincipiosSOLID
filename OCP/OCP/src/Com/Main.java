package Com;

// Main.java
public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Área do círculo: " + calc.calculate(c));
        System.out.println("Área do retângulo: " + calc.calculate(r));
    }
}

