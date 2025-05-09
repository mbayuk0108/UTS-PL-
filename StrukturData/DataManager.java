/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
package StrukturData;
public class DataManager {
    private int[] data;

    // Method untuk set data manual
    public void setDataManual(int[] inputData) {
        this.data = inputData;
    }

    // QuickSort
    public void quickSort(int left, int right) {
        if (left < right) {
            int pivotIndex = partition(left, right);
            quickSort(left, pivotIndex - 1);
            quickSort(pivotIndex + 1, right);
        }
    }

    private int partition(int left, int right) {
        int pivot = data[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (data[j] <= pivot) {
                i++;
                // swap
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1] = data[right];
        data[right] = temp;

        return i + 1;
    }

    // Binary Search
    public int binarySearch(int target) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int[] getData() {
        return data;
    }
}