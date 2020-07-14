package com.leyu.algorithm.common.array.sort;

public class SelectSort {

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int t = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = t;
            }
        }
    }
}
