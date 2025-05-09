/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiPembayaran;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Telah membayar Rp" + amount + " menggunakan Kartu Kredit.");
    }
}