package com.leyu.algorithm.common.array.sort;

import java.util.LinkedList;
import java.util.Queue;

public class RadixQueueSort {

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

        Queue<Integer>[] queue = new Queue[10];

        for (int i = 0; i < queue.length; i++) {
            queue[i] = new LinkedList<Integer>();
        }

        for (int i = 0, n = 1; i < times; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j] / n % 10;
                queue[ys].add(arr[j]);
            }

            int index = 0;

            for (int k = 0; k < queue.length; k++) {
                while (!queue[k].isEmpty()) {
                    arr[index++] = queue[k].poll();
                }
            }
        }

    }

}
