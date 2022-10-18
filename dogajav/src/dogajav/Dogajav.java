/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogajav;

/**
 *
 * @author user3
 */
public class Dogajav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] szamok = new int[]{3,2,15,4,42,3};
        
        int i;
        //1.hány darab páratlan szám van:
        for(i = 0 ; i < szamok.length; i++){  
            if( szamok[i] % 2 !=0 ){  
        System.out.println("A páratlan számok: " + szamok[i]);  
        }  
        }  
        
        //2. Mennyi a számok összege:
        int osszeg = 0;
        
        for(i = 0; i < szamok.length; i++ )
            {
        {
        osszeg = osszeg + szamok[i];
        }
            }
        System.out.println("A számok összege: " + osszeg);
        
        //3. Van-e az elemek között 10 és 20 között szám: 
        i = 0;
        while((szamok[i] > 10 && szamok[i] < 20) & i < szamok.length);
        {
            i++;
        }
        if(i<szamok.length){
            System.out.println("Van!");
        }
        else{
            System.out.println("Nincs!");
        }
        
        
        //4. Mekkora a legkisebb szám: 
        int min = 0;
 
        for(i = 1; i < szamok.length; i++ )
        {
            if( szamok[i] < szamok[min] ) min = i;
        }
        System.out.println("A tömben található legkisebb szám: " + szamok[min]);
    }
    
}
