package listings;

import javax.swing.*;

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
    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }
    double getUmfang(){
       return (radius * 2) * Math.PI;
    }
    void setUmfang(double u){
        this.radius = u / Math.PI;
    }

    double getFlaeche(){
        return (radius * radius) * Math.PI;
    }
    void setFlaeche(double f){
        radius = Math.sqrt(f / Math.PI) ;
    }

    void tabellenAusgabe(){
        radius = Double.parseDouble(JOptionPane.showInputDialog("Gib den Startwert ein:"));
        double steigerung = Double.parseDouble(JOptionPane.showInputDialog("Gib die Steigerung ein:"));
        System.out.println(" Radius   " + "Umfang    " + "Fläche        " );
        System.out.println("----------------------------------");

        for (var i = 0; i <= 30; i++) {
            System.out.println("|  " +
                    Math.round(radius * 100.00) / 100.00 + " |   " +
                    Math.round(getUmfang() * 100.00) / 100.00 + " |  " +
                    Math.round(getFlaeche() * 100.00) / 100.00 + "  |");
            System.out.println("----------------------------------");
            radius += steigerung;
        }
    }
}

public class Kreis_Main {
    public static void main(String[] args) {
        var kreis = new Kreis();
        kreis.tabellenAusgabe();
        //kreis.setRadius(10);
        //kreis.setUmfang(20);

        System.out.println("Der Radius ist: " + kreis.getRadius());
        System.out.println("Der Umfang ist: " + kreis.getUmfang());
        System.out.println("Die Fläche ist: " + kreis.getFlaeche());
    }
}
