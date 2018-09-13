/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprograming;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tugas2 {
    public static void main(String[] args){
        int berat[]={7,5,4,3,2};
        String jenis[]={"E","B","A","D","C"};
        int uang[]={5000,7000,2000,3000,10000};
        int jumlah;
        
        //Scanner
        Scanner a=new Scanner(System.in);
        
       System.out.print("\nMasukan Jumlah Barang: ");
        int JB= a.nextInt();
       
        for(int i=0;i<berat.length;i++){
           if(JB>=berat[i]){
               int jumlahAngkutan=JB/berat[i];
               jumlah=jumlahAngkutan*uang[i];
               JB=JB%berat[i];
               int angkutan=berat[i]*jumlahAngkutan;
               System.out.println("Jenis barang "+jenis[i]+ " dengan maksimal setiap angkutan adalah "+berat[i]+" Kg mengangkut muatan sebesar "+angkutan+" Kg dengan total bayaran : "+jumlah);
           }
           
           
           
       }
    }
    
}
