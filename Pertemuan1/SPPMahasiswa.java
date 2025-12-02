/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;



/**
 *
 * @author setyo
 */
import java.util.HashMap;
import java.util.Scanner;

public class SPPMahasiswa {

    private static final HashMap<String, Boolean> statusPembayaran = new HashMap<>();
    private static final HashMap<String, String> tanggalPembayaran = new HashMap<>();

    private static double totalSPP = 0.0;
    private static final double biayaSPP = 750000; // biaya SPP per mahasiswa

    // Inisialisasi daftar mahasiswa
    static {
        statusPembayaran.put("Ardi", false);
        statusPembayaran.put("Bima", false);
        statusPembayaran.put("Cinta", false);
        statusPembayaran.put("Dewa", false);
        statusPembayaran.put("Evan", false);
    }

    public static void menu() {
        System.out.println("\n===== SISTEM PEMBAYARAN SPP MAHASISWA =====");
        System.out.println("1. Pembayaran SPP");
        System.out.println("2. Lihat Total SPP Masuk");
        System.out.println("3. Lihat Mahasiswa Belum Bayar");
        System.out.println("4. Lihat Mahasiswa Sudah Bayar");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    public static void bayarSPP(String nama, double jumlah, String tanggal) {
        if (statusPembayaran.containsKey(nama)) {
            if (jumlah >= biayaSPP) {
                statusPembayaran.put(nama, true);
                tanggalPembayaran.put(nama, tanggal);
                totalSPP += jumlah;

                System.out.println(nama + " berhasil membayar SPP. Terima kasih!");
            } else {
                System.out.println("Pembayaran kurang. Biaya SPP adalah: " + biayaSPP);
            }
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    public static void lihatTotalSPP() {
        System.out.println("Total uang SPP masuk: Rp " + totalSPP);
    }

    public static void lihatBelumBayar() {
        System.out.println("\nMahasiswa Belum Bayar SPP:");
        boolean ada = false;

        for (String nama : statusPembayaran.keySet()) {
            if (!statusPembayaran.get(nama)) {
                System.out.println("- " + nama);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Semua mahasiswa sudah membayar.");
        }
    }

    public static void lihatSudahBayar() {
        System.out.println("\nMahasiswa Sudah Bayar SPP:");
        boolean ada = false;

        for (String nama : statusPembayaran.keySet()) {
            if (statusPembayaran.get(nama)) {
                System.out.println("- " + nama + " pada tanggal " + tanggalPembayaran.get(nama));
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Belum ada mahasiswa yang melakukan pembayaran.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                menu();
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama mahasiswa: ");
                        String nama = scanner.nextLine();
                        
                        System.out.print("Masukkan jumlah pembayaran: ");
                        double jumlah = scanner.nextDouble();
                        scanner.nextLine();
                        
                        System.out.print("Masukkan tanggal pembayaran (dd-mm-yyyy): ");
                        String tanggal = scanner.nextLine();
                        
                        bayarSPP(nama, jumlah, tanggal);
                        break;
                        
                    case 2:
                        lihatTotalSPP();
                        break;
                        
                    case 3:
                        lihatBelumBayar();
                        break;
                        
                    case 4:
                        lihatSudahBayar();
                        break;
                        
                    case 5:
                        System.out.println("Program selesai.");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
                
            } while (pilihan != 5);
        }
    }
}


