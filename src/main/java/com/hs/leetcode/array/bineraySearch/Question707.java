package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/6 23:17
 */
public class Question707 {

    /**
     * 思路：
     *
     * MyLinkedList是链表对象，而不是节点对象
     *
     * 所以需要创建一个内部类Node
     *
     * 同时MyLinkedList包含 size，head，tail变量
     */

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size;

    public Question707() {
        head=null;
        tail=null;
        size=0;
    }

    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node cur = head;
        while(index>0){
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head=newNode;
        if(tail == null) tail =head;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(tail != null)
            tail.next = newNode;
        tail=newNode;
        if(head == null) head =tail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;

        if(index == 0){
            addAtHead(val);
            return;
        }

        Node foreNode = head;
        int steps = index - 1;
        while(steps-- > 0){
            foreNode = foreNode.next;
        }

        Node newNode = new Node(val);
        newNode.next = foreNode.next;
        foreNode.next = newNode;
        if(newNode.next == null) tail=newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        if(index == 0){
            head = head.next;
            if(head == null) tail = null;
            size--;
            return;
        }
        int i=0;
        Node foreNode = null;
        Node cur = head;
        while(i<index){
            if(i == index-1) foreNode = cur;
            cur = cur.next;
            i++;
        }
        foreNode.next = foreNode.next.next;
        if(foreNode.next == null) tail=foreNode;
        size--;
    }
}
