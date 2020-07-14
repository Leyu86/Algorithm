package com.leyu.algorithm.common.elements;

import com.leyu.algorithm.common.array.Arrays;

public class Array {
    int[] elements;

    public Array() {
        elements = new int[0];
    }

    public Array(int[] arr) {
        elements = arr;
    }

    public int[] add(int num) {
        int len = elements.length + 1;
        int[] newArr = Arrays.copyOf(elements, len);
        newArr[len - 1] = num;
        elements = newArr;
        return elements;
    }

    public int[] remove() {
        if (elements.length < 1) {
            return new int[0];
        }
        int[] newArr = Arrays.copyOf(elements, elements.length - 1);
        elements = newArr;
        return elements;
    }

    public int[] remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new RuntimeException("输入下标不在目标数组下标范围内！");
        }
        int len = elements.length - 1;
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
        return elements;
    }

    public int indexOf(int index) {
        if (index < 0 || index > elements.length) {
            throw new RuntimeException("输入下标不在目标数组下标范围内！");
        }
        return elements[index];
    }

    public int length() {
        if (elements == null)
            return 0;
        return elements.length;
    }

    public boolean isEmpty() {
        return elements == null || elements.length == 0;
    }

    public String toString() {
        if (elements == null) {
            return "null";
        }

        int iMax = elements.length - 1;
        if (iMax < 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; ; i++) {
            sb.append(elements[i]);
            if (i == iMax)
                return sb.append("]").toString();
            sb.append(",");
        }
    }

    public void setElements(int[] array) {
        this.elements = array;
    }

    public int[] getElements() {
        return this.elements;
    }

}
