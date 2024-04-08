package listings;

public class Kreissegmenttest {
    public static void main(String[] args) {
        var segment = new Kreissegment();
        System.out.println("Radius des Kreissegments: " + segment.getRadius());
        segment.radiusVergroesernUm(2);
        System.out.println("Radius des Kreissegments: " + segment.getRadius());

    }
}
