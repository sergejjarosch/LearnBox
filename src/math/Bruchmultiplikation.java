package math;

import javax.swing.*;

class Bruch {
    int zaehler;
    int nenner;
    static int anzahlBrueche = 0;


//************ Konstruktor **************************
    Bruch (int zaehler, int nenner){
        anzahlBrueche++;
        if (nenner == 0){
            System.err.println("Fehler! Der Nenner darf nicht 0 sein");
        } else {
            var hz = zaehler;
            var hn = nenner;
            var r = hz % hn;
            while (r > 0) {
                hz = hn;
                hn = r;
                r = hz % hn;
            }// hn ist der ggT
            this.zaehler = zaehler/hn;
            this.nenner = nenner/hn;
        }
    }
    Bruch(){
        this(0, 1);
    }
    Bruch(int nenner){
        this(nenner, 1);
    }
//***************************************************

//****** Object Methode TO_STRING *******************
    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }
//***************************************************

    void ausgeben(){
        System.out.println(zaehler + "/" + nenner);
    }
    Bruch multipliziere(Bruch m) {
        var z = zaehler * m.zaehler;
        var n = nenner * m.nenner;
        var produkt = new Bruch(z, n);
        return produkt;
    }


    static int getAnzahlBrueche() {
        return anzahlBrueche;
    }
}



public class Bruchmultiplikation {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie den Zähler von Bruch ** a ** ein: ");
        var z = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie den Nenner von Bruch ** a ** ein: ");
        var n = Integer.parseInt(eingabe);
        var a = new Bruch(z, n);
        eingabe = JOptionPane.showInputDialog("Geben Sie den Zähler von Bruch ** b ** ein: ");
        z = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie den Nenner von Bruch ** b ** ein: ");
        n = Integer.parseInt(eingabe);
        var b = new Bruch(z, n);
        var c = a.multipliziere(b);
        System.out.println("Bruch a: " + a.toString());
        System.out.println("Bruch b: " + b.toString());
        System.out.println("Bruch c: " + c.toString());

    }
}
