package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/8 23:11
 */
public class Question142 {
//    public Question203.ListNode detectCycle(Question203.ListNode head) {
//        HashMap<Integer, Question203.ListNode> map = new HashMap<>();
//        int i=0;
//        while(head != null){
//            if(map.containsValue(head)) return head;
//            map.put(i++, head);
//            head = head.next;
//        }
//        return null;
//    }

    /**
     * 思路：
     *
     * 快慢指针法，如果有环，fast和slow一定会相遇(就像跑步一样，如果在环形跑道上跑步，跑得快的和跑得慢的一定会相遇)
     *
     * 而且fast不会越过slow，因为fast相当于一步步接近slow，slow走一步，fast走2步，相当于fast一步步接近slow
     *
     * 当二者相遇的时候，让一个指针从头节点出发，另一个指针从相遇节点出发，最后两个指针会相遇在环的头部
     */
    public static Question203.ListNode detectCycle(Question203.ListNode head) {
        Question203.ListNode fast = head;
        Question203.ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            // 如果有环
            if(fast == slow){
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }


}
