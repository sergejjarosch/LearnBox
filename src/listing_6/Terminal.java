package listing_6;

public class Terminal {
    public static void main(String[] args) {
        var konto1 = new Konto("0000000001",1000);
        System.out.println("Kontonummer: " + konto1.getKontonummer() + "\nKontostand: " + konto1.getKontostand());
        konto1.einzahlen(1500);
        konto1.auszahlen(900);
        System.out.println("Kontonummer: " + konto1.getKontonummer() + "\nKontostand: " + konto1.getKontostand());

    }
}
