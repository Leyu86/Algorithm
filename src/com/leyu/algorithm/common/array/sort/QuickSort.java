package com.leyu.algorithm.common.array.sort;

public class QuickSort {

    public static void quickSort(int[] arr) {
        new QuickSort().quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start < end) {

            int standard = arr[start];
            int low = start;
            int high = end;

            while (low < high) {

                while (low < high && standard < arr[high]) {
                    high--;
                }
                arr[low] = arr[high];

                while (low < high && arr[low] < standard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;

            quickSort(arr, start, low);

            quickSort(arr, (low + 1), end);
        }

    }
}
