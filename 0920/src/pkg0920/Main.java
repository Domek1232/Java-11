/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0920;

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
       
        
        //1. Adj meg egy egész típusú változót kezdőértékkel.
        
        int szam;
        szam = 4;
        
        //2. Egy for ciklussal a megadott számszor írja ki a program, hogy "Hello!"
        
        int i;
        for(i=0; i<szam; i++)
            System.out.println("Hello!");
        
        //3. Írd ki, hogy a megadott szám páros-e vagy páratlan.
        
        if (szam % 2 ==0)
            System.out.println("A szám páros");
        else
            System.out.println("A szám páratlan");
        
        //4. Írd ki a számokat egymás mellé tabulátorral elválasztva 0-tól a megadott számig.
        
        for(i=0; i <= szam ; i++){
            System.out.print(i+"    ");
        }
        System.out.print("");  
        
        //5. Írasd ki ugyanezt visszafelé.
        System.out.println("");
        
        for(i=szam; i >=0;i--){
            System.out.print(i+"    ");
        }
        
        System.out.println("");
        
        //6. Írasd ki a tartomány számai közül csak a párosakat hasonló módon.
        for(i = 0; i<= szam; i++){
        if (i % 2 ==0){
            System.out.println(i+"  ");
        }
        }
        
        //7. Kérj be a felhasználótól egy számot addig, amíg a megadott számot nem írja be.
        
        Scanner bill = new Scanner(System.in);
        
        System.out.println("Adj meg egy számot: ");
         
        int bekerendoSzam = bill.nextInt();
        while (bekerendoSzam != szam){
        bekerendoSzam = bill.nextInt();
         
         }
        
        
    }
    
}
