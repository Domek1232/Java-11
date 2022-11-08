/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;
import java.util.Scanner;
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
        return randomSzam;
    }     
    
    public static double terfogat(int tn, int m) {
        return Math.pow(tn,2)*m/3;
    }
        
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println(atlag(4, 17));
        csillag();
        
        //FELADAT
        //Kérjünk be a felhasználótól 2 számot. 
        int alsoHatar = 0, felsoHatar = 0;
        
        System.out.println("Adjon meg egy számot: ");
        int a = bill.nextInt();
        System.out.println("Adjon meg még egy számot: ");
        int b = bill.nextInt();
        
        //A kisebbik legyen egy tartomány alsó határa, a nagyobika felső.
        // a) Generáltassunk a tartományból egy random számot.
        if (a < b){
            System.out.println(veletlen(a,b));
        } else if (b < a) {
            System.out.println(veletlen(a,b));
        } else System.out.println("A két számból nem generálható véletlen szám.");
        
        // b) Hozzunk létre a függvény segítségével egy 20 elemű tömböt.
        int i;
        int[] tomb = new int[20];
        for (i = 0; i < 20; i++){
            tomb[i] = veletlen(alsoHatar, felsoHatar);
            }
        
        for (i = 0; i < 20; i++){
            System.out.println(tomb[i] + "\t");
        }
    
        // Készítsünk egy metódust, ami kiszámolja egy négyzet alapú gúla térfogatát!
        // Bemenő adatként az alap oldalának hosszát és a magasságot adjuk meg!
       
        System.out.println("Adja meg a gúla oldalának hosszát: ");
        int n = bill.nextInt();
        System.out.println("Adja meg a gúla magasságát: ");
        int m = bill.nextInt();
        System.out.println("A gúla térfogata: " + terfogat(n,m));
    }
}
