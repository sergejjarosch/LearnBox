package math;

public class Bruch {
    int zaehler;
    int nenner;

    void ausgeben(){
        System.out.println(zaehler + "/" + nenner);
    }
    void kuerzen() {
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m % n;
        while (r > 0){
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n;
        nenner /= n;
    }
    void gekuerztausgeben(){
        kuerzen();
        ausgeben();
    }
    void multiplizieren(Bruch m){
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }
}
