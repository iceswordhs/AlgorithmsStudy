package shiyiyue11.Nov_15;

/**
 * @author Hs
 * @Date 2021/11/15 20:34
 */

/**
 * 不使用任何内建的哈希表库设计一个哈希映射（HashMap）。
 *
 * 实现 MyHashMap 类：
 *
 * MyHashMap() 用空映射初始化对象
 * void put(int key, int value) 向 HashMap 插入一个键值对 (key, value) 。如果 key 已经存在于映射中，则更新其对应的值 value 。
 * int get(int key) 返回特定的 key 所映射的 value ；如果映射中不包含 key 的映射，返回 -1 。
 * void remove(key) 如果映射中存在 key 的映射，则移除 key 和它所对应的 value 。
 *
 * 思路：使用Node表示链表，模拟hashmap
 */
public class leetcode_706 {
    //static class Node{
    //    private int key;
    //    private int value;
    //    private Node next;
    //    public Node(int key,int value){
    //        this.key=key;
    //        this.value=value;
    //    };
    //}
    //Node[] map=new Node[1009];
    //public MyHashMap() {
    //
    //}
    //
    //public void put(int key, int value) {
    //    int idx=getIndex(key);
    //    Node cur=map[idx];
    //    Node tmp=cur;
    //    if(cur!=null){
    //        Node pre=null;
    //        while(tmp!=null){
    //            if(key==tmp.key){
    //                tmp.value=value;
    //                return;
    //            }
    //            pre=tmp;
    //            tmp=tmp.next;
    //        }
    //        tmp=pre;
    //    }
    //    Node newnode=new Node(key,value);
    //    if(cur!=null){
    //        tmp.next=newnode;
    //    }else map[idx]=newnode;
    //}
    //
    //public int get(int key) {
    //    Node cur=map[getIndex(key)];
    //    while(cur!=null){
    //        if(cur.key==key) return cur.value;
    //        cur=cur.next;
    //    }
    //    return -1;
    //}
    //
    //public void remove(int key) {
    //    Node cur=map[getIndex(key)];
    //    if(cur!=null) {
    //        Node pre=null;
    //        while(cur!=null){
    //            if(cur.key==key){
    //                if(pre!=null){
    //                    pre.next=cur.next;
    //                    return;
    //                }else map[getIndex(key)]=cur.next;
    //            }
    //            pre=cur;
    //            cur=cur.next;
    //        }
    //    }
    //}
    //
    //public int getIndex(int key){
    //    int code=Integer.hashCode(key);
    //    code^=(code>>>16);
    //    return code% map.length;
    //}
}
