package twenty_days.day7;

/**
 * @author Hs
 * @Date 2021/10/8 19:44
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 * 思路：使用快慢指针，快指针比慢指针快n个节点，二者同时后移，当快指针到达结尾时，慢指针为要删除的节点的前一个节点。
 * (特殊情况：要删除第一个节点，这时快指针为null，n为第一个节点，直接返回head.next就可以了)
 * 对慢指针 slow.next=slow.next.next;
 */
public class sanchudaoshudiNgejiedian19 {
    //public ListNode removeNthFromEnd(ListNode head, int n) {
    //    ListNode fast,slow;
    //    fast=slow=head;
    //    while(n>0){
    //        fast=fast.next;
    //        n--;
    //    }
    //    if(fast==null){//要删除的是第一个节点
    //        return head.next;
    //    }
    //    while(fast.next!=null){//让fast在到达最后一个节点时停止,这样slow就是倒数第n+1个节点
    //        slow=slow.next;
    //        fast=fast.next;
    //    }
    //    slow.next=slow.next.next;
    //    return head;
    //}
}
