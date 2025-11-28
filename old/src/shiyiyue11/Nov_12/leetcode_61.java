package shiyiyue11.Nov_12;

/**
 * @author Hs
 * @Date 2021/11/12 22:20
 */


import shiyiyue11.utils.ListNode;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 * 思路：记录原来的头结点，遍历链表，记录节点数n，然后链表尾节点的next等于原先的头结点，这样就形成了一个环
 *      从当前头节点后移n-k%n-1步，到达这个节点后，保存这个节点的next，next即是新的头结点，然后让next等于null
 */
public class leetcode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode oldhead=head;
        int n=0;
        for(n=1;head.next!=null;n++){
            head=head.next;
        }
        head.next=oldhead;
        ListNode newhead=oldhead;
        for(int i=0;i<n-k%n-1;i++){
            newhead=newhead.next;
        }
        ListNode result=newhead.next;
        newhead.next=null;
        return result;
    }
}
