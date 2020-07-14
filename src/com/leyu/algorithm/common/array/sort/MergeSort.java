package com.leyu.algorithm.common.array.sort;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        new MergeSort().mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeSort(arr, low, mid, high);
    }

    private void mergeSort(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1, index = 0;
        int t[] = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                t[index++] = arr[i++];
            } else {
                t[index++] = arr[j++];
            }
        }

        while (i <= mid) {
            t[index++] = arr[i++];
        }

        while (j <= high) {
            t[index++] = arr[j++];
        }

        for (int k = 0; k < t.length; k++) {
            arr[k + low] = t[k];
        }

    }
}
