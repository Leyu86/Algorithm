package com.leyu.algorithm.lcof.offer03;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumberInArray {

    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i]))
                    return nums[i];
            }
            return -1;
        }
    }
}
