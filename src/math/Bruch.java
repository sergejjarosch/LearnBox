package math;

public class Bruch {
    int zaehler;
    int nenner;

    void ausgeben(){
        System.out.println(zaehler + "/" + nenner);
    }
    Bruch (int zaehler, int nenner){
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
}
