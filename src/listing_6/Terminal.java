package listing_6;

public class Terminal {
    public static void main(String[] args) {
        var konto1 = new Girokonto("0000000001",1000,300);
        System.out.println("Kontonummer: " + konto1.getKontonummer() + "\nKontostand: " + konto1.getKontostand());
        konto1.setLimit(500);

        konto1.auszahlen(1500);
        System.out.println("Kontonummer: " + konto1.getKontonummer() + "\nKontostand: " + konto1.getKontostand());
    }
}
