package Sem;

// Robot.java
class Robot implements Worker {
    public void work() {
        System.out.println("Robô está trabalhando...");
    }

    public void eat() {
        System.out.println("Robô não come, mas foi obrigado a implementar.");
    }

    public void sleep() {
        System.out.println("Robô não dorme, mas foi obrigado a implementar.");
    }

    public void getPaid() {
        System.out.println("Robô não recebe salário, mas foi obrigado a implementar.");
    }
}

