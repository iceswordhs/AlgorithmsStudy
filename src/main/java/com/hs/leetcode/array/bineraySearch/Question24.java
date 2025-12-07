package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/7 23:09
 */
public class Question24 {
    /**
     *思路：
     *
     * 使用虚拟节点，同时如果还有2个以上节点，记录下一个节点和下下一个节点，同时让cur等于下下下个节点
     */
    public static Question203.ListNode swapPairs(Question203.ListNode head) {
        if(head == null || head.next == null) return head;
        Question203.ListNode cur = head;
        Question203.ListNode newHead = new Question203.ListNode();
        Question203.ListNode swapHead = newHead;
        while(cur!=null){
            if(cur.next != null){
                Question203.ListNode firstNode = cur;
                Question203.ListNode secondNode = cur.next;
                cur = secondNode.next;
                secondNode.next = firstNode;
                swapHead.next = secondNode;
                swapHead = firstNode;
                swapHead.next = null;
            }else{
                // cur是最后一个节点
                swapHead.next = cur;
                break;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        System.out.println(swapPairs(new Question203.ListNode(1)));
    }
}
