package swordoffer1;

import swordoffer1.utils.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hs
 * @Date 2021/10/25 21:42
 */

/**
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
 * 每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 思路：如果使用顺序遍历复制的话，random指向的节点可能还未被创建
 *      使用HashMap存储创建的节点，这样就将每个节点的创建隔离了
 */
public class solution35 {
    Map<Node,Node> map=new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        if(!map.containsKey(head)){
            Node newHead=new Node(head.val);
            map.put(head,newHead);
            newHead.next=copyRandomList(head.next);
            newHead.random=copyRandomList(head.random);
        }
        return map.get(head);
    }
}
