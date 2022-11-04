/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

/**
 *
 * @author user3
 */
public class Metodusok {

    //Metódusok és osztályok helye
    public static double atlag(int szam1, int szam2) {

        double atl = (szam1 + szam2) / 2.0;

        return atl;
    }

    // Feladat
    public static void csillag() {
        System.out.println("***************");
        System.out.println("*   Feladat   *");
        System.out.println("***************");
    }
        
    public static int veletlen(int also, int felso) {
        Random rand = new Random();
        int randomSzam = rand.nextInt(felso - also + 1) + also;
        
    }
        
        
        
    public static void main(String[] args) {
        System.out.println(atlag(4, 17));
        csillag();
        
        //FELADAT
        //Kérjünk be a felhasználótól 2 számot. 
        System.out.println("Adjon meg egy számot: ");
        int a = bill.nextInt();
        System.out.println("Adjon meg még egy számot: ");
        int b = bill.nextInt();
        
        //A kisebbik legyen egy tartomány alsó határa, a nagyobika felső.
        if (a < b){
            System.out.println(veletlen(a,b));
        } else if (b < a) {
            System.out.println(veletlen());
        }
        
        // a) Generáltassunk a tartományból egy random számot.
        // b) Hozzunk lérte a függvény segítségével egy 20 elemű tömböt.
        
        	
    
    }

}
