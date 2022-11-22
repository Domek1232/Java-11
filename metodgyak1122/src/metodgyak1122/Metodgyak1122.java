/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodgyak1122;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Metodgyak1122 {

    //írj egy metódust, ami...
    //1. Három szám közül visszaadja a legkisebbet.
    public static double legkisebb(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else if (c <= a && c <= b) {
            return c;
        }
        return a;
    }

    //2. Visszaadja egy string középső karakterét. (1 vagy 2 középső karakter lehet)
    public static String kozep(String str) {
        int pozicio;
        int hossz;
        if (str.length() % 2 == 0) {
            pozicio = str.length() / 2 - 1;
            hossz = 2;
        } else {
            pozicio = str.length() / 2;
            hossz = 1;
        }
        return str.substring(pozicio, pozicio + hossz);
    }

    //3. Visszaadja egy string angol magánhangzóinak számát
    public static int maganhang(String mon) {
        int count = 0;
        for (int i = 0; i < mon.length(); i++) {
            if (mon.charAt(i) == 'a' || mon.charAt(i) == 'e' || mon.charAt(i) == 'i'
                    || mon.charAt(i) == 'o' || mon.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //4. Visszaadja, hány szó van egy stringben
    //5. Visszaadja, hogy egy string érvényes jelszó-e
    //min 10 hosszú
    //betű és számjegy
    //min 2 számjegyet tartalmaz
    //6. A kapott paraméterről eldönti, hogy nevekvő sorban vannak-e
    //7. Visszaadja egy integer szám számjegyeinek összegét
    //72->7+2=9
    //8. kiírja a karaktereket 2megadott karakter között(angol abc)
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("------1. feladat------");
        System.out.println("Adjon meg egy számot: ");
        int a = bill.nextInt();
        System.out.println("Adjon meg még egy számot: ");
        int b = bill.nextInt();
        System.out.println("Adja meg a harmadik számot: ");
        int c = bill.nextInt();

        System.out.println("A legkisebb szám: " + legkisebb(a, b, c));

        System.out.println("------2. feladat------");
        System.out.println("Adjon meg egy tetszőleges szót: ");
        String str = bill.next() + bill.nextLine();
        System.out.println("A középső karakter(ek): " + kozep(str));

        System.out.println("------3. feladat------");
        System.out.println("Adon meg egy tetszőleges szót: ");
        String mon = bill.next() + bill.nextLine();
        System.out.println("A mahánhangzóinak száma: " + maganhang(mon));

        System.out.println("------4. feladat------");
        System.out.println("------5. feladat------");
        
        System.out.println("------6. feladat------");
        
        
        
        System.out.println("------7. feladat------");
        
        
        System.out.println("------8. feladat---");
        
    }

}
