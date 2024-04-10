package listings_5;

import javax.swing.*;

class FlaechenGleicherKreis{
   Rechteck rechteck = new Rechteck();
   Kreis kreis = new Kreis();

   FlaechenGleicherKreis(){
       rechteck.setLeange(Double.parseDouble(JOptionPane.showInputDialog("Länge")));
       rechteck.setBreite(Double.parseDouble(JOptionPane.showInputDialog("Breite")));
       kreis.setFlaeche(rechteck.getFlaeche());

       System.out.println("Rechtecklänge: " + rechteck.getLeange());
       System.out.println("Rechteckbreite: " + rechteck.getBreite());
       System.out.println("Rechteckfläche: " + rechteck.getFlaeche());
       System.out.println("Kreisradius: " + kreis.getRadius());
       System.out.println("Kreisfläche: " + kreis.getFlaeche());
   }
}

public class
FlaecheRechteckKreis_Main {
    public static void main(String[] args) {
    var gleicheFlaeche = new FlaechenGleicherKreis();
    }
}
