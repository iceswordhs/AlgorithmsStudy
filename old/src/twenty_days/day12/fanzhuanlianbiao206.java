package twenty_days.day12;

/**
 * @author Hs
 * @Date 2021/10/13 20:35
 */

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * 思路：双指针，先判断head是否为null，若为null直接返回
 *      否则创建两个指针，一快fast一慢slow；快指针fast指向head
 *      慢指针slow为null
 *      当快指针没到末尾的时候，用node记录快指针fast的next，然后将快指针fast的next指向slow，这样就翻转了一个节点
 *      然后将slow指向fast，fast指向node，这样就向前移了一步
 */
public class fanzhuanlianbiao206 {
    //public ListNode reverseList(ListNode head) {
    //    ListNode fast=null,slow=null;
    //    if(head==null) return head;
    //    fast=head.next;
    //    slow=head;
    //    slow.next=null;
    //    while(fast!=null){
    //        ListNode node=fast.next;
    //        fast.next=slow;
    //        slow=first;
    //        fast=node;
    //    }
    //    return slow;
    //}
}
