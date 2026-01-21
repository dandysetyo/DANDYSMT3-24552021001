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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TableUtil {

    public static void setProduk(JTable table, List<Produk> list) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Id Produk", "Nama Produk", "Harga", "Stok"}, 0
        ) {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        for (Produk p : list) {
            model.addRow(new Object[]{
                p.getIdProduk(),
                p.getNamaProduk(),
                p.getHarga(),
                p.getStok()
            });
        }
        table.setModel(model);
    }
}
