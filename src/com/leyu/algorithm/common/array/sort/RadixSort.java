package com.leyu.algorithm.common.array.sort;

public class RadixSort {

    public static void radixSort(int[] arr) {

        int max = Integer.MAX_VALUE;

        for (int n : arr) {
            if (max < n)
                max = n;
        }

        int times = 0;
        while (max > 0) {
            max /= 10;
            times++;
        }

        int[][] t = new int[10][arr.length];

        int[] count = new int[10];


        for (int i = 0, n = 1; i < times; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j] / n % 10;
                t[ys][count[ys]++] = arr[j];
            }

            int index = 0;

            for (int k = 0; k < count.length; k++) {
                if (count[k] != 0) {
                    for (int l = 0; l < count[k]; l++) {
                        arr[index++] = t[k][l];
                    }
                    count[k] = 0;
                }
            }
        }

    }

}
