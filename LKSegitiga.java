/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lk1_siswa
 */

import java.util.Scanner;
public class LKSegitiga {
      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int alas,tinggi,sisi;
        double luas,keliling;
        
        System.out.print("Masukan Alas : ");
        alas=input.nextInt();
        
        System.out.print("Masukan Tinggi : ");
        tinggi=input.nextInt();
        
        System.out.print("Masukan panjang sisi : ");
        sisi=input.nextInt();

        luas=alas*tinggi/2;
        System.out.println("Luas Segitiga : "+luas);
        
        keliling=3*sisi;
        System.out.println("Keliling Segitiga : "+keliling);
      }
}
