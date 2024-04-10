package tiere;

public abstract class Vogel {
    boolean kannFliegen;
    Vogel() {
        kannFliegen = true;
    }
    Vogel(boolean kf) {
        kannFliegen = kf;
    }
    public abstract void singe();
}
