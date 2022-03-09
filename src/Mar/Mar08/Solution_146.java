package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 20:28
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 请你设计并实现一个满足 LRU (最近最少使用) 缓存 约束的数据结构。
 * 实现 LRUCache 类：
 * LRUCache(int capacity) 以 正整数 作为容量capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value)如果关键字key 已经存在，则变更其数据值value ；
 * 如果不存在，则向缓存中插入该组key-value 。如果插入操作导致关键字数量超过capacity ，则应该 逐出 最久未使用的关键字。
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 *
 *
 * 思路：get为O（1），只有hash表，put为O(1)只有双向链表
 *
 */
public class Solution_146 {
    //int cap;
    //LinkedHashMap<Integer,Integer> cache= new LinkedHashMap<Integer,Integer>();
    ////public LRUCache(int capacity) {
    ////    cap=capacity;
    ////}
    //
    //public int get(int key) {
    //    if(cache.containsKey(key)){
    //        makeRecently(key);
    //        return cache.get(key);
    //    }else{
    //        return -1;
    //    }
    //}
    //
    //public void put(int key, int value) {
    //    if(cache.containsKey(key)){
    //        cache.put(key,value);
    //        makeRecently(key);
    //        return;
    //    }
    //    if(cache.size()>=cap){
    //        int oldKey=cache.keySet().iterator().next();
    //        cache.remove(oldKey);
    //    }
    //    cache.put(key,value);
    //}
    //
    //public void makeRecently(int key){
    //    int value=cache.get(key);
    //    cache.remove(key);
    //    put(key,value);
    //}


    // 不使用LinkedListHashMap
    // 存储类
    class Node{
        int key;
        int value;
        Node next;
        Node pre;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    // 双向链表
    class DoubleList{
        Node head;
        Node tail;
        DoubleList(){
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.pre=head;
        }
        void remove(Node node){
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
        Node removeFirstNode(){
            if(head.next==tail) return null;
            Node node=head.next;
            remove(node);
            return node;
        }
    }
    private DoubleList cache;
    private HashMap<Integer,Node> map;
    int cap;

    //public LRUCache(int capacity) {
    //    cap=capacity;
    //    cache=new DoubleList();
    //    map=new HashMap<>();
    //}

    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            makeRecently(node.key);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            makeRecently(key);
            return;
        }
        // 需要添加新Node，并且当前大于容量，先删除
        if(map.size()>=cap){
            Node node=cache.head.next;
            cache.head.next=node.next;
            node.next.pre=cache.head;
            map.remove(node.key);
        }
        Node newNode=new Node(key,value);
        cache.tail.pre.next=newNode;
        newNode.pre=cache.tail.pre;
        newNode.next=cache.tail;
        cache.tail.pre=newNode;
        map.put(key,newNode);

    }

    public void makeRecently(int key){
        Node node = map.get(key);
        // 先移除node
        cache.remove(node);
        // 将node添加到最后
        cache.tail.pre.next=node;
        node.pre=cache.tail.pre;
        node.next=cache.tail;
        cache.tail.pre=node;
    }
}
