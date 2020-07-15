package com.leyu.algorithm.common.array.sort;

import com.leyu.algorithm.common.Constants;
import com.leyu.algorithm.common.array.Arrays;


public class SortTest {
    static int[] target = Constants.TEST_ARRAY;

    public static void main(String[] args) {

        System.out.println("原数组为：" + Arrays.toString(target));


        //bubbleSortTest();

        //quickSortTest();

        insertSortTest();

        //shellSortTest();

        //selectSortTest();

        //mergeSortTest();

        //radixSortTest();

        //radixQueueSortTest();

        //heapSortTest();
    }

    static void heapSortTest() {
        HeapSort.heapSort(target);
        System.out.println("堆排序后：" + Arrays.toString(target));
    }

    static void radixQueueSortTest() {
        RadixQueueSort.radixSort(target);
        System.out.println("基数（队列实现）排序后：" + Arrays.toString(target));
    }

    static void radixSortTest() {
        RadixSort.radixSort(target);
        System.out.println("基数排序后：" + Arrays.toString(target));
    }

    static void mergeSortTest() {
        MergeSort.mergeSort(target);
        System.out.println("归并排序后：" + Arrays.toString(target));
    }

    static void selectSortTest() {
        SelectSort.selectSort(target);
        System.out.println("选择排序后：" + Arrays.toString(target));
    }

    static void shellSortTest() {
        ShellSort.shellSort(target);
        System.out.println("希尔排序后：" + Arrays.toString(target));
    }

    static void insertSortTest() {
        InsertSort.insertSort(target);
        System.out.println("直接插入排序后：" + Arrays.toString(target));
    }

    static void quickSortTest() {
        QuickSort.quickSort(target);
        System.out.println("快速排序后：" + Arrays.toString(target));
    }


    static void bubbleSortTest() {
        BubbleSort.bubbleSort(target);
        System.out.println("冒泡排序后：" + Arrays.toString(target));
    }

}
