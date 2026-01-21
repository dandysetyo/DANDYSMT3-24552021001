/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_ganjil_3;

/**
 *
 * @author setyo
 */
public class Produk {

    private int idProduk;
    private int idKategori;   // 1=Pet Food, 2=Animal Care
    private String namaProduk;
    private int harga;
    private int stok;

    public Produk() {
    }

    public Produk(int idProduk, int idKategori, String namaProduk, int harga, int stok) {
        this.idProduk = idProduk;
        this.idKategori = idKategori;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
