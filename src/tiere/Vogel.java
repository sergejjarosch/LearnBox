package tiere;

public abstract class Vogel implements VogelgesangInterface {
    boolean kannFliegen;
    Vogel() {
        kannFliegen = true;
    }
    Vogel(boolean kf) {
        super();
        this.kannFliegen = kannFliegen;
    }
    public  void singe(){
        System.out.println(melodie());
    }
}
