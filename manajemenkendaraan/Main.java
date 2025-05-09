/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manajemenkendaraan;

/**
 *
 * @author Muhamad Bayu Khayatullah / 2E
 */
public class Main {
    public static void main(String[] args) {
        KendaraanManager manager = new KendaraanManager();

        try {
            // Menambahkan kendaraan
            manager.tambahKendaraan(new Mobil());
            manager.tambahKendaraan(new SepedaMotor());
            manager.tambahKendaraan(new Bus());

            // Coba menambahkan kendaraan null (akan menyebabkan Exception)
            // manager.tambahKendaraan(null); // Uncomment ini untuk melihat pengecualian

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Menampilkan laporan
        manager.laporanPerjalanan();
    }
}

