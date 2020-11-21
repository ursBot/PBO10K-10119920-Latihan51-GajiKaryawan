/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class GajiKaryawan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Manager m = new Manager();
        
        String nik, nama, jabatan;
        int golongan, kehadiran;
        float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran, gajiTotal;
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        nik = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Golongan (1/2/3) : ");
        golongan = input.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        jabatan = input.next();
        System.out.print("Masukkan Jumlah Kehadiran : ");
        kehadiran = input.nextInt();
        
        m.setNik(nik);
        m.setNama(nama);
        m.setGolongan(golongan);
        m.setJabatan(jabatan);
        m.setKehadiran(kehadiran);
        
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t: " + m.getNik());
        System.out.println("NAMA \t: " + m.getNama());
        System.out.println("GOLONGAN: " + m.getGolongan());
        System.out.println("JABATAN : " + m.getJabatan());
        
        tunjanganGolongan = m.tunjanganGolongan(m.getGolongan());
        tunjanganJabatan = m.tunjanganJabatan(m.getJabatan());
        tunjanganKehadiran = m.tunjanganKehadiran(m.getKehadiran());
        gajiTotal = m.gajiTotal();
        
        System.out.println("\nTUNJANGAN GOLONGAN \t : " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN \t : " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN \t : " + tunjanganKehadiran);
        
        System.out.println("\nGAJI TOTAL \t : " + gajiTotal);
    }
    
}
