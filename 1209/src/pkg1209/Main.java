/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1209;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class Main {
        // készítés egy egy metódust, ami kiszámolja, hogy egy befektetett összegből
        //mennyi lesz egy megadott fix kamattal megadott év alatt.
      public static double befektetes(double osszeg, double kamat, int evek) {
        return osszeg * Math.pow(1 + kamat, evek * 12);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Adja meg a kívánt összeget: ");
 	double beruossz = in.nextDouble();
 	System.out.print("Adja meg a kamat százalékát szám formájában: ");
	double ertek = in.nextDouble();
	System.out.print("Adja meg az évek számát: ");
	int ev = in.nextInt();
        
        ertek *= 0.01;
	
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= ev; i++) {
    	int a = 19;
	    if (i >= 10) a = 18;
	System.out.printf(i + "%"+a+".2f\n", befektetes(beruossz, ertek/12, i));
        }
        }
    }
    

