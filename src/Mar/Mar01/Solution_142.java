package Mar.Mar01;

/**
 * @author Hs
 * @Date 2022/3/2 10:49
 */

import shiyiyue11.utils.ListNode;

/**
 * 题意：
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 不允许修改 链表。
 *
 * 思路：1.hashSet
 * 2.快慢指针  fast，slow两个指针  如果有环，在slow走第一圈时，fast一定会追上他
 * （为什么？假如fast和slow在环的起点同时开始，slow走一半时，fast走完一圈，当slow走完一圈时，fast会追上它
 * 而因为前面还有一段不是环的距离，所以说slow进入环的时候，fast已经在环中了，并且走了几步，所以一定会在slow走完第一圈时追上他）
 * 为什么一定会相遇？fast的速度为2，slow的速度为1,。把slow作为参考系，那么fast的速度为1，每个时间移动1格所以一定会相遇
 * 假设 a为起点到环的距离，b为环的起点到相遇的距离，c为相遇的地点到环起点的距离，n为fast走的圈数
 * 那么 相遇的时候 fast走过的距离就是a+(n+1)b+nc，slow走过的距离就是a+b. 由于任何时刻fast走过的距离都为slow的2倍，所以有
 * a+(n+1)b+nc=2(a+b)  可以推出a=(n-1)(b+c)+c 由于a是起点到环的距离，所以这时从起点再起一个指针他会和slow在起点相遇
 */
public class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            // 当两个指针相遇时，新建一个指针，让它从头开始走
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
