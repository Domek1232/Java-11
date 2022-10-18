/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        //Kérjünk be 2 pozitív egész számot!
        //Számoljuk ki a legkisebb közös többszörüsüket!
        System.out.println("Adj meg egy egész számot: ");
        int szam1 = bill.nextInt();
        System.out.println("Adj meg még egy egész számot: ");
        int szam2 = bill.nextInt();
        int lgn = Math.max(szam1, szam2);
        int lgk = Math.min(szam1, szam2);
        int lkkt = lgn;
        while (lkkt % lgk != 0) {
        lkkt += lgn;
        }
        System.out.println("A legkisebb közös töbszörös: "  + lkkt);
        
        
        }
    }
    

