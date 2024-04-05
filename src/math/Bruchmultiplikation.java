package math;

class Bruch {
    final int zaehler;
    final int nenner;
    static int anzahlBrueche = 0;

    void ausgeben(){
        System.out.println(zaehler + "/" + nenner);
    }

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


    static int getAnzahlBrueche() {
        return anzahlBrueche;
    }
}



public class Bruchmultiplikation {
    public static void main(String[] args) {
        System.out.println("Anzahl der Brüche: " + Bruch.getAnzahlBrueche());
        var rechnungBruch = new Bruch(4,24);


        rechnungBruch.ausgeben();

    }
}
