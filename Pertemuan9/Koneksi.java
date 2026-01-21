/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

/**
 *
 * @author setyo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {

    Connection con = null;
    String statusKoneksi = null;

    public static void main(String[] args) {
        Koneksi tesKoneksi = new Koneksi();
        tesKoneksi.koneksi();
    }

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            String username = "root";
            String password = "";

            con = DriverManager.getConnection(connectionURL, username, password);
            statusKoneksi = "Berhasil";
            JOptionPane.showMessageDialog(null, "Sukses Koneksi");

        } catch (Exception e) {
            statusKoneksi = "Gagal";
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

