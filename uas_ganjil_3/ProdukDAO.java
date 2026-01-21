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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdukDAO {

    public List<Produk> getByKategori(int idKategori) {
        List<Produk> list = new ArrayList<>();
        String sql = "SELECT * FROM produk WHERE id_kategori=? ORDER BY id_produk DESC";

        try (Connection c = Koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idKategori);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produk p = new Produk();
                p.setIdProduk(rs.getInt("id_produk"));
                p.setIdKategori(rs.getInt("id_kategori"));
                p.setNamaProduk(rs.getString("nama_produk"));
                p.setHarga(rs.getInt("harga"));
                p.setStok(rs.getInt("stok"));
                list.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Load data error: " + e.getMessage());
        }
        return list;
    }

    public Produk getById(int id) {
        String sql = "SELECT * FROM produk WHERE id_produk=?";
        try (Connection c = Koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Produk(
                        rs.getInt("id_produk"),
                        rs.getInt("id_kategori"),
                        rs.getString("nama_produk"),
                        rs.getInt("harga"),
                        rs.getInt("stok")
                );
            }
        } catch (SQLException e) {
            System.out.println("Select error: " + e.getMessage());
        }
        return null;
    }

    public boolean insert(Produk p) {
        String sql = "INSERT INTO produk (id_kategori, nama_produk, harga, stok) VALUES (?,?,?,?)";
        try (Connection c = Koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, p.getIdKategori());
            ps.setString(2, p.getNamaProduk());
            ps.setInt(3, p.getHarga());
            ps.setInt(4, p.getStok());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
            return false;
        }
    }

    public boolean update(Produk p) {
        String sql = "UPDATE produk SET nama_produk=?, harga=?, stok=? WHERE id_produk=? AND id_kategori=?";
        try (Connection c = Koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, p.getNamaProduk());
            ps.setInt(2, p.getHarga());
            ps.setInt(3, p.getStok());
            ps.setInt(4, p.getIdProduk());
            ps.setInt(5, p.getIdKategori());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(int idProduk, int idKategori) {
        String sql = "DELETE FROM produk WHERE id_produk=? AND id_kategori=?";
        try (Connection c = Koneksi.getConnection();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idProduk);
            ps.setInt(2, idKategori);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
            return false;
        }
    }
}
