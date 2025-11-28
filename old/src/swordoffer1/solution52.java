package swordoffer1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class solution52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A=headA;
            ListNode B=headB;
            while(A!=B){
                A=A!=null?A.next:headB;
                B=B!=null?B.next:headA;
            }
            return A;
    }
}
