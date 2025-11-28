package twenty_days.day6;

/**
 * @author Hs
 * @Date 2021/10/8 19:16
 */

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。 节点数大于等于1
 *
 * 思路1单指针解法：遍历一遍，得到节点个数。然后除以2.得到返回节点的位置
 * 将位置减1，得到与head节点的距离
 * head节点每向后移一位，距离都减1，当距离为0时，得到中间结点
 *
 * 思路2快慢指针解法：快慢指针刚开始都指向head，慢指针每移一步，快指针移两步，直到快指针为null或快指针的下一位为null
 */
public class lianbiaodezhongjianjiedian876 {
    // 单指针
    //public ListNode middleNode(ListNode head) {
    //    int t=0;
    //    ListNode node=head;
    //    while(node!=null){
    //        t++;
    //        node=node.next;
    //    }
    //    t=t/2+1;//得到节点位置
    //    t--;//得到相对于head的距离
    //    while(t>0){//如果只有1个节点，即中间结点与head距离为0，不进入循环
    //        head=head.next;
    //        t--;
    //    }
    //    return head;
    //}

    //快慢指针
    //public ListNode middleNode(ListNode head) {
    //    ListNode fast,slow;
    //    fast=slow=head;
    //    while(fast!=null&&fast.next!=null){
    //        slow=slow.next;
    //        fast=fast.next.next;
    //    }
    //    return slow;
    //}
}
