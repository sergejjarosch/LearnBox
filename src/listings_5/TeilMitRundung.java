package listings_5;

public class TeilMitRundung {
    double radius;
    TeilMitRundung(){
        radius = 1;
    }
    TeilMitRundung(double r){
        radius = r;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double r){
        radius = r;
    }
    void radiusVergroesernUm(double vr){
        radius = radius + vr;
    }
}
