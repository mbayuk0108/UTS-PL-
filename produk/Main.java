/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package produk;

/**
 *
 * @author ASUS
 */
public class Main {
    private static Produk laptop;
    public static void main(String[] args) {
        Toko tokoElektronik = new Toko();
        
        Produk laptop = new Produk ("Laptop Asus ", 8500000, 10);
        Produk smartphone = new Produk ("Smartphone samsung", 8000000, 15);
        
        tokoElektronik. tambahProduk(laptop);
        tokoElektronik. tambahProduk(smartphone);
        
        //menampilkan daftar produk 
        System.out.println("\nDaftar Produk Awal:");
        tokoElektronik.tampilkanDaftarProduk();
        
        // Update stok
        tokoElektronik.updateStok("laptop Asus", 5, true);  // tambah stok
        tokoElektronik.updateStok("Smartphone Samsung", 3, false); // kurangi stok

        // Menampilkan daftar produk setelah update
        System.out.println("\nDaftar Produk Setelah Update:");
        tokoElektronik.tampilkanDaftarProduk();
    }    
}