package Mar.Mar08;

import java.util.HashMap;

/**
 * @author Hs
 * @Date 2022/3/8 19:07
 */
public class LRUCache {
    // map
    private HashMap<Integer, Node> map;
    // 双向链表
    private DoubleList cache;
    // 最大容量
    private int cap;

    public LRUCache(int capacity){
        this.cap=capacity;
        cache=new DoubleList();
        map=new HashMap<>();
    }

    /* 将某个 key 提升为最近使用的 */
    private void makeRecently(int key) {
        Node node = map.get(key);

        // 先从双向链表中删除
        cache.remove(node);

        // 再将它添加到尾部
        cache.addLast(node);
    }

    /* 添加最近使用的元素 */
    private void addRecently(int key, int val) {
        Node node = new Node(key, val);
        cache.addLast(node);
        map.put(key,node);
    }

    /* 删除某一个 key */
    private void deleteKey(int key) {
        Node node = map.get(key);
        cache.remove(node);
        map.remove(key);
    }

    /* 删除最久未使用的元素 */
    private void removeLeastRecently() {
        // 最前面的就是最久未使用的
        Node node = cache.removeFirst();
        // 从map中移除
        map.remove(node.key);
    }

    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return map.get(key).val;
    }

    public void put(int key,int val){
        // 如果已经有了该key
        if (map.containsKey(key)){
            makeRecently(key);
            // 修改val的值
            Node node = map.get(key);
            node.val=val;
            map.put(key,node);
            return;
        }
        // 如果还没满
        if (cache.size() >= cap) {
            // 如果已经满了，移除最久未使用的，然后再添加
            removeLeastRecently();
        }
        addRecently(key, val);
    }
}
