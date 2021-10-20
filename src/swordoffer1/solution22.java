package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/20 17:15
 */

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 * 思路：快慢指针 快指针比慢指针块k个节点，
 * 例如 一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6
 * 快慢指针都指向头结点，然后让快指针后移k步，然后当快指针不为null时，二者同步后移；
 * 注意：即便是返回倒数第6个节点也没关系，因为快指针直接后移了6步，指向了null，直接返回了head
 */
public class solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow=head;
        while(k!=0){
            head=head.next;
            k--;
        }
        while(head!=null){
            head=head.next;
            slow=slow.next;
        }
        return slow;
    }
}
