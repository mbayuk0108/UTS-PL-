/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiPembayaran;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class PaymentProcessor {
    private static PaymentProcessor instance;
    private PaymentProcessor() {
        // private constructor untuk mencegah instansiasi langsung
    }
    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}