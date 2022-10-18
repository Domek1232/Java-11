/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11072;

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
        String szoveg = "Ez egy tetszőleges szöveg. ";
        
        //szöveg hossza         
        System.out.println(szoveg.length());
        
        //adott pozición levő karakter
        System.out.println(szoveg.charAt(1));
        
        //kis betű lessz az összes
        System.out.println(szoveg.toLowerCase());
        
        //csupa nagy betűs
        System.out.println(szoveg.toUpperCase());
        
        //sorvégi szóköz levágása
        System.out.println(szoveg.trim().length());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg. "));
        System.out.println(szoveg.equals("Ez egy..."));
        System.out.println(szoveg.equalsIgnoreCase("ez egy tetszőleges szöveg. "));
        
        //összefűzés
        System.out.println(szoveg.concat("Ez pedig egy hozzáfűzött."));
        
        //tartalmazza-e
        System.out.println(szoveg.contains("tetszőleges"));
        
        //végződik-e valamivel
        System.out.println(szoveg.endsWith(" "));
        
        //kezdődik-e valamivel
        System.out.println(szoveg.startsWith(" "));
        
        //keresett karakter(ek) első poziciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //keresett karakter(ek) utolsó poziciója
        System.out.println(szoveg.lastIndexOf("t"));
        
        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg2 = "";
        System.out.println(szoveg2.isEmpty());
        
        //lecseréli a szövegben az összes! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges", "akármilyen"));
        System.out.println(szoveg.replace("e", "b"));
        
        //lecseréli a szövegben az első! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replaceFirst("e", "b"));
        
        //string szétszedése tömbbe megadott karakterek mentén
        System.out.println(szoveg.split(" "));
        
        //nem string típusú adat stringgé alakítása
        //Integer szam = 512;
        //System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3,6));
        
        //FELADATOK
        
        System.out.println("-----1. FELADAT -----");
        
        //1.Kérjünk be egy diák teljes nevét a fullName változóba!
        
        String fullName, firstName, lastName;
        int szokozhely;
        Scanner bill = new Scanner(System.in);
        System.out.println("Add meg a teljes neved: ");
        fullName = bill.nextLine();
      
       
        System.out.println("-----2. FELADAT -----");
        
        //2.Szedjük szét a nevet firstName és lastName változókba!
        
        firstName = fullName.split(" ") [1];
        lastName = fullName.split(" ") [0];
        
        System.out.println(firstName);
        System.out.println(lastName);
        
        System.out.println("-----3. FELADAT -----");
        
        //3.Kérjük be az osztály azonosítóját a classId változóba. pl. 2022ea vagy 2018ce stb.
        
        System.out.println("Addja meg a(z) osztály azonosítóját: ");
        
        
        System.out.println("-----4. FELADAT -----");
        //4.Ha a betűjele 'e'-vel kezdődik, alakítsuk 'E'-re.
        System.out.println("-----5. FELADAT -----");
        //5.Ha au évfolyam száma 2022, akkor az osztályazonosító minden betűje legyen nagy.
        System.out.println("-----6. FELADAT -----");
        //6.Ha az osztály mindkét betűjele nagybetűs, írjuk ki,hogy estis osztály.
        
        
    }
    
}
