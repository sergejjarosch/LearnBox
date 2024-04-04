package math;

public class App {
    public static void main(String[] args) {
        Bruch b = new Bruch();
        b.zaehler = 3;
        b.nenner = 12;
        b.ausgeben();
        System.out.println("\nnach dem Kürzen: ");
        b.kuerzen();
        b.ausgeben();
        b.gekuerztausgeben();

    }
}
