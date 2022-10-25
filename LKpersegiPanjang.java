

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class LKpersegiPanjang {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int panjang,lebar;
        double luas,keliling;
        
        System.out.print("Masukan Panjang : ");
        panjang=input.nextInt();
        
        System.out.print("Masukan Tinggi : ");
        lebar=input.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang : "+luas);
        
        keliling=2*panjang*lebar;
        System.out.println("Keliling Persegi Panjang : "+keliling);
      }
}
