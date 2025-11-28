package Mar.Mar01;

/**
 * @author Hs
 * @Date 2022/3/2 11:28
 */

import shiyiyue11.utils.ListNode;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 * 保证不存在环
 *
 * 思路：双指针 遍历完A链表再去遍历B链表，什么时候两个指针相遇，什么时候退出
 */
public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode a,b;
        a=headA;
        b=headB;
        while(headA!=headB){
            if(headA==null){
                headA=b;
            }else{
                headA=headA.next;
            }
            if(headB==null){
                headB=a;
            }else{
                headB=headB.next;
            }
        }
        return headA;
    }
}
