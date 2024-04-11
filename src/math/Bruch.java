package math;

import java.sql.SQLOutput;

public class Bruch {
    private int zaehler;
    private int nenner;

    Bruch(){
        zaehler = 0;
        nenner = 1;
    }
    Bruch(int z){
        zaehler = z;
        nenner = 1;
    }
    Bruch(int z, int n){
        zaehler = z;
        nenner = n;
    }

    int getZaehler(){
        return zaehler;
    }

    int getNenner(){
        return nenner;
    }

    void setZaehler(int z){
        zaehler = z;
    }

    void setNenner(int n){
        nenner = n;
    }

    void ausgeben(){
        System.out.println(this.zaehler + "/" + this.nenner);
    }
    String buchToString(){
        return zaehler + "/" + nenner;
    }

    void kuerzen(){
        var m = Math.abs(this.zaehler); //Betrag von zaehler
        var n = Math.abs(this.nenner); //Betrag von nenner
        var r = m % n;
        while (r > 0) {// Berechnung des ggT
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }



    void gekuerztausgeben(Bruch c){
        kuerzen();
        ausgeben();
    }
    boolean equals(Bruch x){
        var a = new Bruch(this.zaehler, this.nenner);
        var b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }


    void addieren (Bruch b){
        var neuerBruch = new Bruch();
        int z = ( this.zaehler * b.nenner ) + ( b.zaehler * this.nenner );
        int n = this.nenner * b.nenner;
        neuerBruch.zaehler = z;
        neuerBruch.nenner = n;
        neuerBruch.kuerzen();
        neuerBruch.ausgeben();
    }

    void subtrahieren (Bruch b){
        var neuerBruch = new Bruch();
        int z = ( this.zaehler * b.nenner ) - ( b.zaehler * this.nenner );
        int n = this.nenner * b.nenner;
        neuerBruch.zaehler = z;
        neuerBruch.nenner = n;
        neuerBruch.kuerzen();
        neuerBruch.ausgeben();
    }
}
