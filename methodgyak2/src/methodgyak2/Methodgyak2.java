/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodgyak2;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Methodgyak2 {
    
    //írjunk egy-egy metódust, ami...
    //1. ellenőrzi,hogy egy egész szám minden számjegye páros-e
     public static boolean parose(int szam){
        final int sz = 10;
        if (szam == 0){
            return false;
        }
        while(szam != 0){
            if((szam % sz) % 2 != 0){
                return false;
            }
            szam /= 10;
        }
        return true;
    }
    //2. három egész számot kér, és eldönti, hogy az egyik a másik kettő középpontja-e.
    public static boolean eldonti(int a , int b, int c){
        int max = Math.max(a, Math.max (b,c));
        int min = Math.min(a, Math.min(b, c));
        int kozepso = a+b+c - max -min;
        
        if(kozepso == a || kozepso == b || kozepso == c){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //3. ami egy n számot kap paraméterként, és kiír egy n x n-es mátrixot véletlen 0 ill. 1 számjegyekből
    public static void matrixszam(int m){
        Random rand = new Random();
        String matrix = "";
        int a,i;
        
        for(i = 0; i < m; i++){
            for(a= 0; a < 5; a++){
                if(rand.nextInt(2) == 1){
                    matrix= matrix + "0 ";
                }else {
                    matrix= matrix + "1 ";
                }
                System.out.println(matrix);
                    matrix="";
            }
        }
    }
    
    public static void main(String[] args) {
        int szam = 22;
        System.out.println(parose(szam));
        
        int a = 2;
        int b = 5;
        int c = 8;
        System.out.println(eldonti(a,b,c));
        
        
    }
    
}
