/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1007;
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
        
        //Kérjünk be a felhasználótól egy nullánál nagyobb páros számot.(ellenőrzött input)
        int szam = szamol.nextInt();
        
        while(szam<0 & szam % 2 != 0){
        System.out.println("Adj meg egy páros számot ami nullánál nagyobb: ");
        szam = In.nextInt();
        }
       
            
        
        
    }
    
}
