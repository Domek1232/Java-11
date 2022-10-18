/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //egész számok
      
        byte homerseklet = 19;
        short magassag = 175;
        int fizetes = 850000;
        long nyeremeny = 250000000;
         
        // valós számok
        
        float tomeg = 44333.56789f;
        double ezEgyValosszam = 225549776.524874;
        
        //karakter  
        
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicode kódja hexadecimálisan
  
        
        //logikai
        boolean vane = false;
        
        //változó értékeinek ki íratása
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosszam);
        System.out.println(egyBetu);
        System.out.println(masikBetu);
        System.out.println(vane);
        System.out.println((int)masikBetu);
        
        //adattípusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTetelje = Byte.MAX_VALUE;
        System.out.println(byteAlja);
        //A byte addatípus tartománya -128 értéktől 127 értékig terjed
        System.out.println("A byte addatípus tartománya " + byteAlja + " értéktől " + byteTetelje + " értékig terjed");
        System.out.println("Az integer addatípus tartománya " + Integer.MIN_VALUE + " értéktől " + Integer.MAX_VALUE + " értékig terjed");
        System.out.println("Az float addatípus tartománya " + Float.MIN_VALUE + " értéktől " + Float.MAX_VALUE + " értékig terjed");
        System.out.println("Az short addatípus tartománya " + Short.MIN_VALUE + " értéktől " + Short.MAX_VALUE + " értékig terjed");
        System.out.println("Az long addatípus tartománya " + Long.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed");
        System.out.println("Az double addatípus tartománya " + Double.MIN_VALUE + " értéktől " + Double.MAX_VALUE + " értékig terjed");      
    }
    
}
