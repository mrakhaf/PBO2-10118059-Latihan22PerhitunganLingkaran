/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan22perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("======PERHITUNGAN LINGKARAN======");
        System.out.print("Masukkan nilai diameter lingkaran(cm): ");
        String Diameter = input.next();
        
        //validasi
        while(!(Diameter.matches("[0-9]*"))){
            System.out.println("Nilai Diameter tidak sesuai");
            System.out.println("");
            System.out.print("Masukkan nilai diameter lingkaran(cm): ");
            Diameter = input.next();
        }
        System.out.println("");
        System.out.println("-----Hasil Perhitungan Lingkaran------");
        int d = Integer.parseInt(Diameter);
        int jariJari;
        float luasLingkaran , kelilingLingkaran;
        jariJari = d/2;
        luasLingkaran = (int) (3.14*jariJari*jariJari);
        kelilingLingkaran = (int)(2*3.14*jariJari);
        
        System.out.println("Jari - jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luasLingkaran + " cm");
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran + " cm");
        System.out.println("");
        System.out.println("(Developed by mrakhaf)");
        
    }
    
}
