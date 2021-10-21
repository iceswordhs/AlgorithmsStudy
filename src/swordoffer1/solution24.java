package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/21 17:40
 */

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 思路：双指针：快指针指向head，慢指针指向空；
 * 当快指针不为null的时候，保存快指针的next，然后让快指针的next指向慢指针；
 * 快慢指针都后移一位
 */
public class solution24 {
    public ListNode reverseList(ListNode head) {
        ListNode fast=null;
        ListNode slow=null;
        fast=head;
        while(fast!=null){
            ListNode t=fast.next;
            fast.next=slow;
            slow=fast;
            fast=t;
        }
        return slow;
    }
}
