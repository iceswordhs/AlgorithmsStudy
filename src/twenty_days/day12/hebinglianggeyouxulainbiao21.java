package twenty_days.day12;

/**
 * @author Hs
 * @Date 2021/10/13 20:02
 */

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 思路：新建一个节点node作为新链表的头部，再新建一个指针root保存新链表头部的位置
 *      当l1和l2都不为null的时候，比较l1和l2的值，
 *      将小的那一个作为node的下一个节点，
 *      并且小的那一个后移，node也变为node.next
 *      当循环退出后，将不为null的剩余链表添加到node后面，返回root.next。因为root是新建的节点，是空的。
 */
public class hebinglianggeyouxulainbiao21 {
    //public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //    ListNode node=new ListNode();
    //    ListNode root=node;
    //    while(l1!=null&&l2!=null){
    //        if(l1.val<l2.val){
    //            node.next=l1;
    //            node=node.next;
    //            l1=l1.next;
    //        }else {
    //            node.next=l2;
    //            node=node.next;
    //            l2=l2.next;
    //        }
    //    }
    //    if(l1!=null){
    //        node.next=l1;
    //    }else {
    //        node.next=l2;
    //    }
    //    return root.next;
    //}
}
