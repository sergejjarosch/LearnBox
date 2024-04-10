package tiere;

public abstract class VogelMitLambda {
    boolean kannFliegen;
    VogelgesangInterface gesang;

    VogelMitLambda(boolean kannFliegen, VogelgesangInterface gesang) {
        super();
        this.kannFliegen = kannFliegen;
        this.gesang = gesang;
    }
    public void singe(){
        System.out.println(gesang.melodie());
    }
}
