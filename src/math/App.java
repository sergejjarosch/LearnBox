package math;

public class App {
    public static void main(String[] args) {
        var a = new Bruch();
        a.zaehler = 6;
        a.nenner = 4;
        a.ausgeben();
        System.out.println("\nnach dem Kürzen: ");
        a.gekuerztausgeben();
        var b = new Bruch();
        b.zaehler = 3;
        b.nenner = 12;

        a.multiplizieren(b);
        b.ausgeben();
        a.ausgeben();





    }
}
