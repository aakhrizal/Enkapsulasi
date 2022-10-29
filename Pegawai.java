/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pegawai;

/**
 *
 * @author Akhrizal
 */
import java.util.Scanner;

class Pekerja{
    private String nama, jabatan;
    private int gajipokok, masuk;
    public int total;
 

    public String getNama() {
        return nama;
    }

    public void setNama(String name) {
        this.nama = name;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getMasuk() {
        return masuk;
    }

    public void setMasuk(int masuk) {
        this.masuk = masuk;
    }
    
}


public class Pegawai {
    public static void main (String[] args)throws Exception {
        Pekerja pegawai1 = new Pekerja();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tugas Enkapsulasi :");
        System.out.println("Ahmad Akhrizal - 06.2021.1.07375");
        System.out.println("--- Hitung Gaji Pekerja ---");
        System.out.print("Nama : ");
        pegawai1.setNama(input.nextLine());
        System.out.print("Jabatan : ");
        pegawai1.setJabatan(input.nextLine());
        System.out.print("Gaji Pokok : Rp.");
        pegawai1.setGajipokok(input.nextInt());
        System.out.print("Total Kerja (Hari) : ");
        pegawai1.setMasuk(input.nextInt());
        
        pegawai1.total = pegawai1.getMasuk()*pegawai1.getGajipokok();
        System.out.println("Total Gaji Rp."+pegawai1.total);
    }   
}
