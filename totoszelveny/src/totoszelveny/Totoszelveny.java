package totoszelveny;

import java.util.Random;
import java.util.Vector;

public class Totoszelveny {

    public static void main(String[] args) {

        // 0 = döntetlen, 1 = hazai nyertes, 2= vendég   
        System.out.println("0 = döntetlen, 1 = hazai nyertes, 2 = vendég \n");
        System.out.println("ez az aktuális heti nyertes szelvény számai: ");
        szamolas.nyerőszamokkiir();
        System.out.println("Az ön tipp számai: ");
        szamolas.tippszamokkir();
    }
   
}
