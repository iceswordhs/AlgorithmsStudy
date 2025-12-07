package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/7 23:10
 */
public class Question19 {
    /**
     * 思路：
     *
     * 使用快慢指针，让快指针先走n步，然后让快慢指针同时往后走，直到快指针走到末尾，
     * 这时慢指针在倒数第n+1个节点，直接让slow.next = slow.next.next即可
     */
    public static Question203.ListNode removeNthFromEnd(Question203.ListNode head, int n) {
        Question203.ListNode dunnyHead = new Question203.ListNode();
        Question203.ListNode fast = dunnyHead;
        Question203.ListNode slow = dunnyHead;
        dunnyHead.next = head;
        for(int i=0; i<n; i++){
            fast=fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dunnyHead.next;
    }

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(new Question203.ListNode(3), 1));
    }
}
