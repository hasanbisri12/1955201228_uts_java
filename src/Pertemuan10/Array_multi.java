/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

/**
 *
 * @author MOHAMAD HASAN BISRI
 */
public class Array_multi {
    public static void main(String[] args) {
        System.out.println("Array 1 Dimensi");
        int bilangan[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //Array 1 Dimensi
        
        for(int i=0; i<bilangan.length; i++){
            System.out.println(bilangan[i]);
        }
        
        System.out.println("Array 2 Dimensi untuk integer");
            int matriks[][] = {{1,4},
                                {5,7}};
            for(int i=0; i<matriks.length; i++){
                for(int j=0; j<matriks[0].length; j++){
                    System.out.println(matriks[i][j] + " ");
                }
                System.out.println(" ");
            }
            
        System.out.println("Array 2 dimensi untuk String");
        String nama [][] = {{"01", "Sumarno"}, {"02", "Keder"}, {"03", "Badrun"}};
        
            for (int x=0; x<nama.length;x++){
            System.out.println("merk : "+nama [x] [0]);
              System.out.println("merk : "+nama [x] [1]);
              System.out.println("----------------------------");
            
    }
        
    
    }   
}
