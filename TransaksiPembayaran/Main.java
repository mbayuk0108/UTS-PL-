/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TransaksiPembayaran;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat metode pembayaran menggunakan factory
        PaymentMethod method1 = PaymentFactory.createPayment("creditcard");
        PaymentMethod method2 = PaymentFactory.createPayment("paypal");

        // Memproses pembayaran dengan Singleton PaymentProcessor
        PaymentProcessor processor = PaymentProcessor.getInstance();

        processor.processPayment(method1, 2000000);
        processor.processPayment(method2, 3500000);
    }
}