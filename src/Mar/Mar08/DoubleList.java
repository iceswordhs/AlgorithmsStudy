package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 17:55
 */

/**
 * 双向链表实现LRU
 */
public class DoubleList {

    // 头尾虚节点
    private Node head,tail;
    private int size;
    public DoubleList(){
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.pre=head;
        size=0;
    }

    // 在链表尾部添加节点 x，时间 O(1)
    public void addLast(Node x) {
        x.pre=tail.pre;
        x.next=tail;
        tail.pre.next=x;
        tail.pre=x;
    }

    // 删除链表中的 x 节点（x 一定存在）
    // 由于是双链表且给的是目标 Node 节点，时间 O(1)
    public void remove(Node x) {
        Node t=x.pre;
        t.next=x.next;
        x.next.pre=t;
        size--;
    }

    // 删除链表中第一个节点，并返回该节点，时间 O(1)
    public Node removeFirst() {
        if (head.next==tail) return null;
        Node first=head.next;
        remove(first);
        return first;
    }

    // 返回链表长度，时间 O(1)
    public int size(){
        return size;
    }
}
