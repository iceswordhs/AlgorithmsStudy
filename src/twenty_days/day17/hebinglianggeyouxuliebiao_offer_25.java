package twenty_days.day17;

/**
 * @author Hs
 * @Date 2021/10/18 19:50
 */

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 思路：新建一个结点node,新建一个变量root也指向node
 *      当l1和l2都不为null时，让node.next等于较小的值，并让较小的值的链表向下一步
 *      循环结束后，直接让node.next的下一个节点等于不为空的那个链表
 *      返回root.next
 */
public class hebinglianggeyouxuliebiao_offer_25 {
    //public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //    if(l1==null) return l2;
    //    if(l2==null) return l1;
    //    ListNode node=new ListNode();
    //    ListNode root=node;
    //    while(l1!=null&&l2!=null){
    //        if(l1.val<l2.val){
    //            node.next=l1;
    //            node=node.next;
    //            l1=l1.next;
    //        }else{
    //            node.next=l2;
    //            node=node.next;
    //            l2=l2.next;
    //        }
    //    }
    //    if(l1!=null) node.next=l1;
    //    else node.next=l2;
    //    return root.next;
    //}
}
