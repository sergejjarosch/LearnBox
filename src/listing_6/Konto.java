package listing_6;

public class Konto {
    private String kontonummer;
    private double kontostand;
    Konto(String kontonummer, double kontostand){
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }
    public String getKontonummer(){
        return kontonummer;
    }
    public double getKontostand(){
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    void einzahlen(double einzahlung){
        kontostand += einzahlung;
    }
    void auszahlen(double auszahlung){
        kontostand -= auszahlung;
    }



}
