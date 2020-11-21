/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan51.gajikaryawan;

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

public class Manager extends Karyawan {
    
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran (int kehadiran) {
        this.tunjanganKehadiran = tunjanganKehadiran;
        
        tunjanganKehadiran = kehadiran * 10000;
        
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan (String jabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
        
        jabatan = jabatan.toLowerCase();
        switch (jabatan) {
            case "manager":
                tunjanganJabatan = 2000000;
                break;
            case "kabag":
                tunjanganJabatan = 1500000;
                break;
            default:
                tunjanganJabatan = 0;
                break;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan (int golongan) {
        this.tunjanganGolongan = tunjanganGolongan;
        
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        
        return tunjanganGolongan;
    }
    
    public float gajiTotal () {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
