/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakelas;


/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class biodata {
     public static void main(String[] args) {
        String nama,alamat,kelas,motivasi;
        int umur,tinggiBadan,beratBadan;
        
        Scanner data=new Scanner(System.in);
        
        System.out.println("BIODATA");
        
        System.out.print("Nama Anda : ");
        nama = data.nextLine();
        System.out.print("Alamat Anda : ");
        alamat = data.nextLine();
        System.out.print("Kelas Anda : ");
        kelas = data.nextLine();
        System.out.print("Motivasi Anda : ");
        motivasi = data.nextLine();
        System.out.print("Umur anda : ");
        umur = data.nextInt();
        System.out.print("Tinggi badan anda : ");
        tinggiBadan = data.nextInt();
        System.out.print("Berat badan anda : ");
        beratBadan = data.nextInt();
        
     }
}
