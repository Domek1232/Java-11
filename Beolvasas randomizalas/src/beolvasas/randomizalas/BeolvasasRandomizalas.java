/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasas.randomizalas;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        //adat beolvasás billentyűzetről - egész szám
        System.out.println("Adj meg egy egész számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.println("A beolvasott érték: " + szam1);
        
        //adot beolvasás billentyűzetről - valós számo 
        System.out.println("Adj meg egy valós számot: ");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A beolvasott érték: " + szam2);
        
        //adat beolvasás billentyűzetről - string tipusú vátozó 
        System.out.println("Adj meg egy szöveget: ");
        String betu1;
        betu1 = bill.next();
        System.out.println("A beolvasott szöveg: " + betu1);
        
        //random szám generálás
        //(int)( Math.random()*(felső-alsó+1) )+alsó;
        int randomSzam = (int)(Math.random() *21) + 10; //tíz és húsz közötti a szám
        System.out.println(randomSzam);
        
        int RandomSzam = (int)(Math.random() * 21);
        System.out.println(RandomSzam);
        
        int Randomszam = (int)(Math.random() * 71) -55;
        System.out.println(Randomszam);
        
        int randomszam = (int)(Math.random() * 46) -40;
        System.out.println(randomszam);
        
        int randomszam1 = (int)(Math.random() * 26) -45;
        System.out.println(randomszam1);
        
    }
    
}
