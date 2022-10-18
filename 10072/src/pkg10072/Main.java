/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10072;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner szamol = new Scanner(System.in);
        System.out.println("------------Első Feladat------------");        
        //1.  Kérjünk be a felhasználótól egy nullánál nagyobb páros számot.(ellenőrzött input)
        System.out.println("Adj meg egy páros számot ami nullánál nagyobb: ");
        int szam = szamol.nextInt();
        
        while(!(szam>0 && szam % 2 == 0)){
        szam = szamol.nextInt();
        }
        System.out.println("A szám értéke:" + szam);
        
        //2. Ugyanez hátúl tesztelővel
        System.out.println("------------Második Feladat------------");
        do{
            szam = szamol.nextInt();
        }
        while (!(szam>0 && szam % 2 == 0));
        System.out.println("Az értéke:" + szam);
        
        //3. 1-10 között gondoljon egy számra a gép
        System.out.println("------------Harmadik Feladat------------");
        Scanner random = new Scanner(System.in);
        System.out.println("Adjon meg egy számot:");
        
        
        
        
        
        
        
        
    }
    
}
