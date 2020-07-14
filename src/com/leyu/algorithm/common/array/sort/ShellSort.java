package com.leyu.algorithm.common.array.sort;

public class ShellSort {
    public static void shellSort(int[] arr) {

        int len = arr.length;
        for (int d = len / 2; d > 0; d /= 2) {
            for (int i = d; i < len; i++) {
                for (int j = i; j >= d && arr[j] < arr[j - d]; j -= d) {
                    int temp = arr[j];
                    arr[j] = arr[j - d];
                    arr[j - d] = temp;
                }
            }
        }
    }

}
