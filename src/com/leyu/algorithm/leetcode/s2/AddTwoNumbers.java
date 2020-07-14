package com.leyu.algorithm.leetcode.s2;

import com.leyu.algorithm.common.elements.ListNode;

public class AddTwoNumbers {

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode node1 = l1;
            ListNode node2 = l2;
            int nextIndex = 0;
            ListNode head = new ListNode(0);
            ListNode res = head;
            while(node1 != null || node2 != null){
                int val1 = 0, val2 = 0;
                if(node1 != null) {
                    val1 = node1.val;
                    node1 = node1.next;
                }
                if(node2 != null) {
                    val2 = node2.val;
                    node2 = node2.next;
                }
                int result = val1 + val2 + nextIndex;
                if(result >= 10) {
                    result %= 10;
                    nextIndex = 1;
                }
                else nextIndex = 0;
                ListNode cnode = new ListNode(result);
                head.next = cnode;
                head = head.next;
            }
            if(nextIndex == 1){
                ListNode cnode = new ListNode(1);
                head.next = cnode;
                head = head.next;
            }
            return res.next;
        }
    }
}
