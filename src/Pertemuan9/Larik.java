/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

/**
 *
 * @author MOHAMAD HASAN BISRI
 */
public class Larik {
    public static void main(String[] args) {
        
        //Contoh Deklarasi array cara pertama
        int angka[] = new int[5];
        angka[0] = 120;
        angka[1] = 220;
        angka[2] = 320;
        angka[3] = 420;
        angka[4] = 520;
        
        //Contoh Deklarasi array cara kedua
        String namaTeman[] = {"Sumarno", "Bagus", "Randi", "Bisri"};
        
        //cara print array
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for(int i=0; i<namaTeman.length; i++){
            System.out.println(namaTeman[i]);
        }
    }
    
}
