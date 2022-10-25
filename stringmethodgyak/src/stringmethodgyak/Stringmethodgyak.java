/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethodgyak;

/**
 *
 * @author user3
 */
public class Stringmethodgyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diak osztály objektuma(Vad Alma)példányosítás útján jön létre.";
        //FELADAT:
        //Vad Alma nevét szedjük ki a szövegből, és csupa nagybetűs formátumban tároljuk el a nev nevű változóban.
        System.out.println(szoveg.indexOf("("));
        System.out.println(szoveg.indexOf(")"));
        String nev = szoveg.substring(25,33).toUpperCase();
        System.out.println(szoveg.replace("Alma", "Körte"));
        System.out.println(nev.toLowerCase().replace(" ", ".").concat(".2020i@bankitatabanya.hu"));
        
        
        
    }
    
}
