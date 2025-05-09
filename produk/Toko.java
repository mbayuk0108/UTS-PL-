package produk;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class Toko {
    private final ArrayList<Produk> daftarProduk;

    public Toko() {
        daftarProduk = new ArrayList<>();
    }

    // Menambahkan produk baru
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        System.out.println("Produk ditambahkan: " + produk.getNama());
    }

    // Mencari produk berdasarkan nama
    public Produk cariProduk(String nama) {
        for (Produk p : daftarProduk) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                return p;
            }
        }
        return null;
    }

    // Mengupdate stok produk tertentu
    public void updateStok(String namaProduk, int jumlah, boolean tambah) {
        Produk produk = cariProduk(namaProduk);
        if (produk != null) {
            if (tambah) {
                produk.tambahStok(jumlah);
                System.out.println("Stok berhasil ditambah.");
            } else {
                produk.kurangiStok(jumlah);
                System.out.println("Stok berhasil dikurangi.");
            }
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public void tampilkanDaftarProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p);
        }
    }
}