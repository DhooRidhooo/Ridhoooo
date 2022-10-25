
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
public class LKPersegi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sisi;
        double luas,keliling;
        
        System.out.print("Masukan Sisi : ");
        sisi=input.nextInt();

        luas=sisi*sisi;
        System.out.println("Luas Persegi : "+luas);
        
        keliling=4*sisi;
        System.out.println("Keliling Persegi : "+keliling);
      }
}

