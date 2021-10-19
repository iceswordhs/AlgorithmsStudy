package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/19 19:44
 */

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 思路：两种情况：
 *      1.如果要删除头结点，进行特判；
 *      2.删除的不是头结点，
 *      当当前节点的下一个节点不为null，判断下一个节点是否是要删除的节点，
 *      如果是，直接让next等于下一个节点的next
 *      否则，当前节点后移一位
 */
public class solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode node=head;
        while(node.next!=null){

            if(node.next.val==val){
                node.next=node.next.next;
                break;
            }
            node=node.next;
        }
        return head;
    }
}
