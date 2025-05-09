package TransaksiPembayaran;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class PaymentFactory {
    public static PaymentMethod createPayment(String type) {
        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCard();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPal();
        } else {
            throw new IllegalArgumentException("Tipe pembayaran tidak dikenal: " + type);
        }
    }
}