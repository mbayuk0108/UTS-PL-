/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenkendaraan;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.ArrayList;

public class KendaraanManager {
    private final ArrayList<Kendaraan> daftarKendaraan;

    public KendaraanManager() {
        daftarKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) throws Exception {
        if (kendaraan == null) {
            throw new Exception("Kendaraan tidak valid.");
        }
        daftarKendaraan.add(kendaraan);
    }

    public void laporanPerjalanan() {
        System.out.println("=== Laporan Perjalanan Kendaraan ===");
        for (Kendaraan k : daftarKendaraan) {
            k.jalan();
        }
    }
}

