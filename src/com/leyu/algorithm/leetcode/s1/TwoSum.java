package com.leyu.algorithm.leetcode.s1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                if(map.containsKey(target - nums[i])){
                    return new int[]{i,map.get(target - nums[i])};
                }
                map.put(nums[i], i);
            }

            throw new IllegalArgumentException("没有匹配的结果");
        }
    }
}
