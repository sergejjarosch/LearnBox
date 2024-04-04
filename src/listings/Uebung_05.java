package listings;

class Kreis{
    private double radius;
    Kreis(){
        this.radius = 0.0;
    }
    Kreis (float radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getUmfang(){
        double umfang = radius * Math.PI;
        return Math.round(umfang * 100.0) / 100.0;
    }
    double getFlaeche(){
        double flaeche = Math.PI * (getUmfang() * getUmfang());
        return Math.round(flaeche * 100.0) / 100.0;
    }
}


public class Uebung_05 {
    public static void main(String[] args) {
        var kreis = new Kreis();
        kreis.setRadius(12.6);
        System.out.println(kreis.getRadius());
        System.out.println(kreis.getUmfang());
        System.out.println(kreis.getFlaeche());
    }
}
