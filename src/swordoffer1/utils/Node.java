package swordoffer1.utils;

/**
 * @author Hs
 * @Date 2021/10/25 21:42
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
