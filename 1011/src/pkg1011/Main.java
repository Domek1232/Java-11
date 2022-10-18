/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1011;
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
        //Hozz létre egy 10 elemű integer tömböt.
        int[] tomb = new int[10];
        System.out.println("-----------Generáld le random az elemeit (1-10 közötti szám).-----------");
        //Generáld le random az elemeit (1-10 közötti szám).
        for( int i = 0; i < tomb.length; i++ )
        {
        tomb[i] = (int)(Math.random() * 10) + 1;
        }
        for( int i = 0; i < tomb.length; i++ )
        {
        System.out.println("A tömb elemei: " + tomb[i]);
        }
        
        System.out.println("------------összegezd az elemeit------------");
        //-összegezd az elemeit
        int osszeg = 0;
 
        for( int i = 0; i < tomb.length; i++ )
            {
        {
        osszeg = osszeg + tomb[i];
        }
            }
        System.out.println("Az elemek összege: " + osszeg);
        
        System.out.println("----------számláld meg a páros számokat----------");
        //-számláld meg a páros számokat
        int parosszam = 0;
        for( int i = 0; i < tomb.length; i++ )
            {
                if( tomb[i] % 2 == 0 ){
                    parosszam += 1;
                }
            }
        System.out.println("Ennyi párosszám található a tömbbe: "+parosszam);
        
        System.out.println("---------mekkora a legkisebb---------");
        //-mekkora a legkisebb
        int min = 0;
 
        for( int i = 1; i < tomb.length; i++ )
        {
            if( tomb[i] < tomb[min] ) min = i;
        }
        System.out.println("A tömben található legkisebb szám: " + tomb[min]);
        
        System.out.println("------------mekkora a legnagyobb------------");
        //-mekkora a legnagyobb
        int max = 0;
 
        for( int i = 1; i < tomb.length; i++ )
        {
            if( tomb[i] > tomb[max] ) max = i;
        }
 
        System.out.println("A tömben található legnagyobb szám: " + tomb[max]);
        
        System.out.println("-------hányadik eleme a listának az első 5-nél kisebb szám-------");
        //-hányadik eleme a listának az első 5-nél kisebb szám
        int i = 0;
 
        while( tomb[i] >= 5 )
        {
            i++;
        }
        
        System.out.println("Az első 5-nél kisebb szám indexe: " +i);
        
        System.out.println("------------van-e a számok között 4-gyel osztható------------");
        //-van-e a számok között 4-gyel osztható
        i = 0 ;
        while(i < tomb.length && (tomb[i] % 4 !=0))
        {
        i++;
        }
        
        if(i < tomb.length )
            {
             System.out.println("Van a számok között 4-gyel osztható.");
            }
    }
    
}
