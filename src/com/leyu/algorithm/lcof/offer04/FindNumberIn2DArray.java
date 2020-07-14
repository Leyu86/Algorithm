package com.leyu.algorithm.lcof.offer04;

public class FindNumberIn2DArray {

    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            for (int y = matrix.length - 1, x = 0; x < matrix[0].length && y >= 0; ) {
                if (matrix[y][x] < target) {
                    x++;
                } else if (matrix[y][x] > target) {
                    y--;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
