package com.leyu.algorithm.common.array;

import com.leyu.algorithm.common.array.sort.QuickSort;

public class Arrays {

    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        int len = Math.min(original.length, newLength);
        for (int i = 0; i < len; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    public static void sort(int[] a) {
        QuickSort.quickSort(a);
    }


}
