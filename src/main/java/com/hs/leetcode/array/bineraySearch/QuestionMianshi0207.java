package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/8 23:10
 */
public class QuestionMianshi0207 {
//        public static Question203.ListNode getIntersectionNode(Question203.ListNode headA, Question203.ListNode headB) {
//            if(headA == null || headB == null) return null;
//            Question203.ListNode curA = headA;
//            Question203.ListNode curB = headB;
//            boolean readAnotherListA = false;
//            boolean readAnotherListB = false;
//            while(curA != curB){
//                if(curA == null && !readAnotherListA){
//                    curA = headB;
//                    readAnotherListA = true;
//                }else if(curA != null) curA = curA.next;
//                if(curB == null && !readAnotherListB){
//                    curB = headA;
//                    readAnotherListB = true;
//                }else if(curB != null) curB = curB.next;
//                if(curA == null && curB == null) return null;
//            }
//            return curB;
//        }

    /**
     * 思路：
     *
     * 用两个指针分别指向A、B头节点，一直向后遍历，当curA或者curB为null时，让他们为headB、headA，
     * 如果没有交点，curA和curB一定会同时为null，因为他们走的步数是一样的
     */
    public static Question203.ListNode getIntersectionNode(Question203.ListNode headA, Question203.ListNode headB) {
        if(headA == null || headB == null) return null;
        Question203.ListNode curA = headA;
        Question203.ListNode curB = headB;
        // 如果没有交点，curA和curB一定会同时为null，因为他们走的步数是一样的
        while(curA != curB){
            if(curA == null){
                curA = headB;
            }else if(curA != null) curA = curA.next;
            if(curB == null){
                curB = headA;
            }else if(curB != null) curB = curB.next;
            if(curA == null && curB == null) return null;
        }
        return curB;
    }

    public static void main(String[] args) {
        System.out.println(getIntersectionNode(new Question203.ListNode(2), new Question203.ListNode(1)));
    }
}
