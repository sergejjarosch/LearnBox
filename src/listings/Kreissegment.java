package listings;

public class Kreissegment extends TeilMitRundung{
    double winkel;
    Kreissegment (){
        super();
        winkel = 90;
    }
    Kreissegment (double r, double w){
        super(r);
        winkel = w;
    }

    double getFlaeche(){
        return Math.PI * radius * radius * winkel/360;
    }
    double getUmfang(){
        return 2 * Math.PI * radius * winkel/360 + 2* radius;
    }
}
