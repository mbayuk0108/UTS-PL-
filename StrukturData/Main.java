/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StrukturData;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataManager dm = new DataManager();
        Scanner input = new Scanner(System.in);

        // Data dimasukkan langsung (hardcoded)
        int[] angka = {35, 11, 78, 3, 29, 79, 30, 7, 10};
        dm.setDataManual(angka);

        System.out.println("Data sebelum diurutkan:");
        tampilkanArray(dm.getData());

        dm.quickSort(0, dm.getData().length - 1);

        System.out.println("\nData setelah diurutkan:");
        tampilkanArray(dm.getData());

        System.out.print("\nMasukkan angka yang ingin dicari: ");
        int cari = input.nextInt();
        int hasil = dm.binarySearch(cari);

        if (hasil != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam data.");
        }
    }

    public static void tampilkanArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}