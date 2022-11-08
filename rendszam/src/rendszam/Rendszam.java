/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszam;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Rendszam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        String rendszam = new String();
        
        do{
            System.out.println("Add meg a rendszáot: ");
            rendszam = bill.nextLine();
        } while (!isValidRendszamV2(rendszam));
    }

    private static boolean isValidRendszamV2(String rsz) {
        if i;
        if (rsz.length() == 6 && isDigit(rsz.charAt(3)) && isDigit(rsz.charAt(4)) && isDigit(rsz.charAt(5))
                && isLetter(rsz.charAt(0)) && isLetter(rsz.charAt(1)) && isLetter(rsz.charAt(2))){
            return true;
        }
        
            return false;
    }
    
}
