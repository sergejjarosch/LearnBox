package listings_5;

class Rechteck{
    private double leange;
    private double breite;

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setLeange(double leange) {
        this.leange = leange;
    }

    public double getBreite() {
        return breite;
    }

    public double getLeange() {
        return leange;
    }

    public void setSeiten (double leange, double breite){
        this.leange = leange;
        this.breite = breite;
    }

    double getLangeSeite(){
        if(breite > leange){
            return breite;
        }
        return leange;
    }
    double getKurzeSeite(){
        if(breite < leange){
            return breite;
        }
        return leange;
    }

    double getDiagonale(){
        double diagonale = Math.sqrt(Math.pow(leange, 2) + Math.pow(breite, 2));
        return Math.round(diagonale * 100.0) / 100.0; // Runden auf 2 nachkomma Stellen
    }
    double getFlaeche(){
        double flaeche = leange * breite;
        return Math.round(flaeche * 100.0) / 100.0;
    }
     double getUmfang(){
        double umfang = (leange * 2) + (breite * 2);
        return Math.round(umfang * 100.0) / 100.0;
     }

     void laengeVergroessern(double l){
        this.leange += l;
     }
     void breiteVergroesern(double b){
        this.breite += b;
     }

     void laengeVerkleinern(double l){
        this.leange -= l;
     }
     void breiteVerkleinern(double b){
        this.breite -= b;
     }


    Rechteck(double breite, double leange){
        this.leange = leange;
        this.breite = breite;
    }
    Rechteck(){
        this(0,0);
    }

}
public class Rechteck_Main {
    public static void main(String[] args) {
        var rechteck = new Rechteck(6,7);
        rechteck.laengeVergroessern(10);
        rechteck.breiteVergroesern(10);
        rechteck.laengeVerkleinern(5);
        rechteck.breiteVerkleinern(5);
        System.out.println(rechteck.getBreite());
        System.out.println(rechteck.getLangeSeite());
        System.out.println(rechteck.getKurzeSeite());
        System.out.println(rechteck.getDiagonale());
        System.out.println(rechteck.getFlaeche());
        System.out.println(rechteck.getUmfang());
    }
}
