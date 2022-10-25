/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogajavito1025;

/**
 *
 * @author user3
 */
public class Dogajavito1025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Sok lúd dosznót győz";
        String masikszoveg = "Sok kacsa malacot nyer";
        //1.FELADAT
        System.out.println(szoveg.length());
        //2.FELADAT
        System.out.println(szoveg.indexOf(0));
        //3.FELADAT
        System.out.println(szoveg.compareTo(masikszoveg));
        //4.FELADAT
        System.out.println(szoveg.contains("lúd"));
        //5.FELADAT
        System.out.println(szoveg.indexOf("lúd"));
        //6.FELADAT
        System.out.println(szoveg.replace("lúd", "veréb"));
        //7.FELADAT
        int szokoz = szoveg.indexOf(" ");
            String szovegSzokoz = szoveg.substring(szokoz);
        System.out.println(szovegSzokoz);
        
    }
    
}
