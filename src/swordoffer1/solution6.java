package swordoffer1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class solution6 {
//    public int[] reversePrint(ListNode head) {//用队列存储然后输出
//        Deque<Integer> stack=new LinkedList<>();
//        while(head!=null){
//            stack.offer(head.val);
//            head=head.next;
//        }
//        int[] res=new int[stack.size()];
//        int i;
//        for(i=0;i<res.length;i++){
//            res[i]=stack.pollLast();
//        }
//        return res;
//    }
    public int[] reversePrint(ListNode head) {
        ListNode listNode=head;
        int i=0;
        while(head!=null){
            i++;
            head=head.next;
        }
        int[] res=new int[i];
        for(int j=0;j<i;j++){
            res[i-1-j]=listNode.val;
            listNode=listNode.next;
        }
        return res;
    }
}
