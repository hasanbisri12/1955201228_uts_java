/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoptionPane;
import javax.swing.JOptionPane;
/**
 *
 * @author MOHAMAD HASAN BISRI
 */
public class JOptionPane_Main {
    public static void main( String[] args ){
    
        
        int input, jumlah1, jumlah2, jumlah3, total, total1, total2, total3;
        String a="";
        String b="", c="", d="";
        do
        {
            a=JOptionPane.showInputDialog("=================MENU MAKANAN=================\n1. Ayam Bakar\n2. Bebek Bakar\n3. Lele Bakar\n4. Keluar\nMasukkan Nomor Pilihan Anda: ");
            input=Integer.parseInt(a);
            if(input==1)
            {
                b=JOptionPane.showInputDialog("Anda memilih Ayam Bakar\nHarga 1 porsi = Rp.15.000,-\n\nInput jumlah porsi : \n");
                jumlah1=Integer.parseInt(b);
                total=jumlah1*15000;
                JOptionPane.showMessageDialog(null, "Total harga untuk "+jumlah1+" porsi adalah Rp."+total+"\n=================TERIMAKASIH=================");
            }
            else if(input==2)
            {
                c=JOptionPane.showInputDialog("Anda memilih Bebek Bakar\nHarga 1 porsi = Rp.20.000,-\n\nInput jumlah porsi : \n");
                jumlah2=Integer.parseInt(c);
                total=jumlah2*20000;
                JOptionPane.showMessageDialog(null, "Total harga untuk "+jumlah2+" porsi adalah Rp."+total+"\n=================TERIMAKASIH=================");
            }
            else if(input==3)
            {
                d=JOptionPane.showInputDialog("Anda memilih Lele Bakar\nHarga 1 porsi = Rp.10.000,-\n\nInput jumlah porsi : \n");
                jumlah3=Integer.parseInt(d);
                total=jumlah3*10000;
                JOptionPane.showMessageDialog(null, "Total harga untuk "+jumlah3+" porsi adalah Rp."+total+"\n=================TERIMAKASIH=================");
            }
            else if(input==4)
            {
                JOptionPane.showMessageDialog(null, "TERIMAKASIH");
                System.exit(0);
            }
        }
        while(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Input Lagi?")==JOptionPane.YES_NO_OPTION);
        System.exit(0);
  
    }
    }

