package totoszelveny;

//import java.util.Arrays;

import java.util.Arrays;


public class szamolas {
    
    
    
    /*
     public szamolas(int elso, int masodik, int harmadik,int negyedik,int otodik , int hatodik) throws Exception{ //control spac-el előhozható az egész
        if(elso <=0 )
            throw new IllegalArgumentException("Hiba! 'a'<=0.");  //program itt véget ér , kell a THROW 
        if(masodik <=0 )
            throw new IllegalArgumentException("Hiba! 'b'<=0."); 
        if(harmadik <= 0)
            throw new IllegalArgumentException("Hiba! 'c'<=0.");
        if (negyedik <= 0) 
            throw new IllegalArgumentException("Hiba! Nincs Háromszög."); 
        
        this.a = a;
        this.b = b;
        this.c = c;
     //this.tippszamok[0]=elso;
    }
        */
       
    
    
    
    
    
    public static int[] nyerőszamokkiir(){
        int[] hetinyertesszamok = new int[14];
        //0-2-ig véletlenszám generálás, és tömb feltöltés
        for (int i = 1; i < hetinyertesszamok.length; i++) {
            hetinyertesszamok[i] = (int) (Math.random() * 3);
        }
        //Tömb elemek egymás mellé rendezés
        for (int i = 0; i < hetinyertesszamok.length; i++) {
            
        }
        System.out.println();
        
        return hetinyertesszamok;
        
        
  
    }
    public static int[] tippszamokkir(){
     int[] tippszamok = new int[14];
        //0-2-ig véletlenszám generálás, és tömb feltöltés
        for (int i = 1; i < tippszamok.length; i++) {
            tippszamok[i] = (int) (Math.random() * 3);
        }
        //Tömb elemek egymás mellé rendezés
        for (int i = 0; i < tippszamok.length; i++) {
            
        }
        System.out.println();
        return tippszamok;
    
    }
    
    public static void osszehasonlit(){
        int nyerők[] = (int[]) nyerőszamokkiir();
        int tippek[] = (int[]) tippszamokkir();
        
        int nemtalált =0;
        
        /*
        
        Tesztelés teljes egyezés esetén:       
        
        //tippek = nyerők;
        
        Tesztelés 1 eltéréssel
       
        
        tippek = nyerők;
        
        if (tippek[0] == 0 ) {
            
            tippek[0] =1;
            
        }
        else
        {
            tippek[0] =0;
        }
        
        nemtalált =1;
        
        */
        
        for (int i = 0; i < nyerők.length; i++) {
            if (nyerők[i] != tippek[i] )
            {
                nemtalált++;
            }
        }
        
      
               
        System.out.println("Nyerőszámok:");
        System.out.println("---------------"); 
                for (int i = 0; i < nyerők.length; i++) {
            //itt iratjuk ki a többi számot ami nem az x
              if (nyerők[i] == 0 )
            {
                System.out.print("x");
                
                
            }          
            else
              {
                  System.out.print(nyerők[i]);
                  
              }   
            
        }
        
        System.out.println();
        //System.out.println(Arrays.toString(nyerők));//ide
        System.out.println("---------------");
        System.out.println("Tippek:");
        
        
             for (int i = 0; i < tippek.length; i++) {
            //itt iratjuk ki a többi számot ami nem az x
              if (tippek[i] == 0 )
            {
                System.out.print("x");
                
                
            }          
            else
              {
                  System.out.print(tippek[i]);
              }   
            
        }
        System.out.println();
        
        //System.out.println(Arrays.toString(tippek));//és ide a tippszámokkal
        System.out.println("---------------");
        
        
        if (nemtalált <= 0) {
            System.out.println("Ön nyert!!");
            System.out.println("Önnek telitalálata volt. 15 ből 15-öt eltalált.");
        }
        
        else if (nemtalált == 1) {
            System.out.println("Ön nyert!!");
            System.out.println("Önnek "+nemtalált+"-hibás találata volt. 14 ből 13-at eltalált.");
        }
         else if (nemtalált == 2) {
             System.out.println("Ön nyert!!");
            System.out.println("Önnek "+nemtalált+"-hibás találata volt. 14 ből 12-őt eltalált.");
        }
        else if (nemtalált == 3) {
            System.out.println("Ön nyert!!");
            System.out.println("Önnek "+nemtalált+"-hibás találata volt. 14 ből 11-et eltalált.");
        }
        else if (nemtalált == 4) {
            System.out.println("Ön nyert!!");
            System.out.println("Önnek "+nemtalált+"-hibás találata volt. 14 ből 10-et eltalált.");
        }
        
        
        else {
            System.out.println("Ön sajnos vesztett! \n"+nemtalált+"-hibás találata volt. ");
        }
        
        
       //                System.out.println(nemtalált);
       
       
       
       
        
//        swich(nyeroszamok[i])
//                case (tippszamok[i])
//                    pass;
//                case 2    
//                    pass;
        
        }

//    private static Object tippszamok() {
//        for (int i = 0; i < 14; i++) {
//            //if (nyeroszamokkiir.hetinyertesszamok[i] <0) {
//                
//            }
//        }
//        throw new UnsupportedOperationException("Érvénytelen szelvény."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
//        @Override
//   public String toString(){
//      // return super.toString();
//      return "HÁromszög{a: "+elso+" b: "+b+" c: "+c+" , K: "+kerulet()+" , T: "+extra.Format.left(terulet(),0 ,3)+"}";
//   }

        //@Override
//    public boolean equals(szamolas h){
//       int[] tomb= {this.elso ,this.masodik ,this.harmadik , h.getA(),h.getB(),h.getC()}; //true;
//       Arrays.sort(tomb);
//       return(tomb[0]==tomb[1] && tomb[2]==tomb[3] && tomb[4]==tomb[5] );
//    }
    
    
    
    
//    try {
//            System.out.println("Elötte");
//            new Haromszog(0, 0, 0);
//            System.out.println("Utánna");
//        } 
//        catch (IllegalArgumentException e) {
//            //;
//           // e.printStackTrace(); //metódus hívási láncon vezet minket végig
//            System./*err*/out.println(e.getMessage());
//        }
//        /*
//        finally {
//        
//        }*/
}
    
