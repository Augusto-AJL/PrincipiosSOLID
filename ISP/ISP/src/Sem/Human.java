package Sem;

class Human implements Worker {
    public void work() {
        System.out.println("Humano está trabalhando...");
    }

    public void eat() {
        System.out.println("Humano está comendo...");
    }

    public void sleep() {
        System.out.println("Humano está dormindo...");
    }

    public void getPaid() {
        System.out.println("Humano recebeu seu salário.");
    }
}
