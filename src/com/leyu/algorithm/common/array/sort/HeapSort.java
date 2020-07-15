package com.leyu.algorithm.common.array.sort;

public class HeapSort {

    public static void heapSort(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapSort(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {

            //将堆顶元素与末尾元素进行交换
            int t = arr[0];
            arr[0] = arr[j];
            arr[j] = t;

            //重新对堆进行调整
            heapSort(arr, 0, j);
        }

    }

    public static void heapSort(int[] arr, int i, int length) {

        int temp = arr[i];//先取出当前元素i
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
}
