package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/5 21:38
 */
public class Question203 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode removeElements(ListNode head, int val) {
        /**
         * 思路：
         *
         * 创建一个假节点dummy，同时使用另一个指针tail表示新链表的尾指针
         *
         * 遍历链表，如果链表值不为val，让tail.next等于该节点
         *
         * 遍历结束之后，让tail.next=null，防止残留
         */
        ListNode dummy = new ListNode();//创建虚假节点
        ListNode tail = dummy;
        ListNode cur = head;
        while(cur != null){
            if(cur.val != val) {
                tail.next = cur;
                tail = cur;
            }
            cur = cur.next;
        }
        tail.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = removeElements(new ListNode(3, new ListNode()), 3);
        System.out.println(listNode.val);
    }
}
