package tiere;

public class Kuckkuck extends VogelMitLambda {

    /*@Override
    public String melodie(){
        return "Kuckkuck - Kuckkuck";
    }

     */
    Kuckkuck(){
        super(true, () -> {return "Kuckkuck";});
    }
}
