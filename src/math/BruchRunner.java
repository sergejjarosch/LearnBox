package math;

public class BruchRunner {
    public static void main(String[] args) {
        var bruch_1 = new Bruch(5,10);
        var bruch_2 = new Bruch(3,8);

        bruch_1.addieren(bruch_2);
        bruch_1.subtrahieren(bruch_2);
    }
}
