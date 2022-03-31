package totoszelveny;

public class szamolas {
    
    public static void nyerőszamokkiir(){
        int[] hetinyertesszamok = new int[15];
        //0-2-ig véletlenszám generálás, és tömb feltöltés
        for (int i = 1; i < hetinyertesszamok.length; i++) {
            hetinyertesszamok[i] = (int) (Math.random() * 3);
        }
        //Tömb elemek egymás mellé rendezés
        for (int i = 0; i < hetinyertesszamok.length; i++) {
            System.out.print(hetinyertesszamok[i] + " " );
        }
        System.out.println();
  
    }
    public static void tippszamokkir(){
     int[] tippszamok = new int[15];
        //0-2-ig véletlenszám generálás, és tömb feltöltés
        for (int i = 1; i < tippszamok.length; i++) {
            tippszamok[i] = (int) (Math.random() * 3);
        }
        //Tömb elemek egymás mellé rendezés
        for (int i = 0; i < tippszamok.length; i++) {
            System.out.print(tippszamok[i] + " " );
        }
        System.out.println();
    
    }
}
    
