/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author user3
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egyágú leágazás 
        int szam = 20;
        if (szam > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        } 
        
        //létágú elágazás
        if (szam > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        
        else {
            System.out.println("Nem nagyobb");
        }
        
        //többágú elágazás 
        if (szam > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam*2);
        }
        
        else if (szam < 20) {
            System.out.println("Kissebb");
        } 
        else {
            System.out.println("Egyenlő");
        }
        
        //sok ágú 
        int honap = 10;
        switch( honap ) {
            case 1: System.out.println("Január");
            
            case 10: System.out.println("Október"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Nem meghatározható.");
        }
        
        //FEALADAT:
        //rando generáltassunk egy kisbetűt(angol abc szerint)
        int randomkarakterocode = (int)(Math.random() *26) + 97; 
        System.out.println(randomkarakterocode);
        System.out.println((char)randomkarakterocode);
        
                
        
    }
    
}
