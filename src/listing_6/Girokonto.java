package listing_6;

public class Girokonto extends Konto{
    private double limit;
    Girokonto(String kontonummer, double kontostand, double limit) {
        super(kontonummer, kontostand);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
    @Override
    void auszahlen(double auszahlen){
        if ((getLimit() + getKontostand()) < auszahlen){
            System.out.println("FEHLER! Kreditlimit überschritten!");
        } else {
            setKontostand(getKontostand() - auszahlen);
        }
    }
}
