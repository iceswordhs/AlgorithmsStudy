package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/6 23:29
 */
public class Question206 {
    /**
     * 思路：
     *
     * 使用fore，cur，next三个指针分别表示前一个节点，当前节点，下一个节点
     *
     * 注意链表为空的情况
     *
     * 同时遍历完列表之后还需要让最后一个节点的next=fore
     *
     * 然后返回最后一个节点 cur
     */
    public static Question203.ListNode reverseList(Question203.ListNode head) {
        if(head == null) return head;
        Question203.ListNode newHead = head;
        Question203.ListNode cur = head;
        Question203.ListNode next = null;
        Question203.ListNode fore = null;

        while(cur.next != null){
            next = cur.next;
            cur.next = fore;
            fore = cur;
            cur = next;
        }
        cur.next = fore;
        return cur;
    }
}
