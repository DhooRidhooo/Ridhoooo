
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
public class LKLingkaran {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jari;
        double luas,keliling;
        
        System.out.print("Masukkan jari-jari : ");
        jari=input.nextInt();

        luas=3.14*jari*jari;
        System.out.println("Luas Lingkaran : "+luas);
        
        keliling=2*3.14*jari;
        System.out.println("Keliling Lingkaran : "+keliling);
      }
}

