/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_Constructor;

/**
 *
 * @author setyo
 */
public class daftarkan_sim {
    public String namaPemilik;
    public String jenisSIM;
    public String nomorSIM;
    public int tahunPembuatan;
    private boolean statusTerdaftar = false;

    public daftarkan_sim(String namaPemilik, String jenisSIM, String nomorSIM, int tahunPembuatan) {
        this.namaPemilik = namaPemilik;
        this.jenisSIM = jenisSIM;
        this.nomorSIM = nomorSIM;
        this.tahunPembuatan = tahunPembuatan;

        // SIM dianggap valid jika nomor SIM minimal 8 karakter
        statusTerdaftar = nomorSIM.length() >= 8;
    }

    void check_status() {
        if (statusTerdaftar) {
            System.out.println(">> SIM Sudah Terdaftar");
            System.out.println(">> Nama Pemilik   : " + namaPemilik);
            System.out.println(">> Jenis SIM      : " + jenisSIM);
            System.out.println(">> Nomor SIM      : " + nomorSIM);
            System.out.println(">> Tahun Pembuatan: " + tahunPembuatan + "\n");
        } else {
            System.out.println("!! SIM Belum Terdaftar (Nomor SIM tidak valid)\n");
        }
    }
}

