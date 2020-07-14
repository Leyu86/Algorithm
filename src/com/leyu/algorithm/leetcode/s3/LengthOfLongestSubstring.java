package com.leyu.algorithm.leetcode.s3;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, ans = 0;
            Map<Character,Integer> map = new HashMap<>();
            while(j < s.length()){
                if(map.containsKey(s.charAt(j))){
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                map.put(s.charAt(j), ++j);
                System.out.println(s.substring(i,j));
                ans = Math.max(ans, j - i);
            }
            return ans;
        }
    }
}
