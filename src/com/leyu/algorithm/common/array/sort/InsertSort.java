package com.leyu.algorithm.common.array.sort;

public class InsertSort {

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0 && arr[j] > arr[j + 1]; j--) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
