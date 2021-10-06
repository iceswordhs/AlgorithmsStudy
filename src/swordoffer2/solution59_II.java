package swordoffer2;

import java.util.Deque;
import java.util.LinkedList;

class MaxQueue {

    Deque<Integer> max;
    Deque<Integer> queue;
    public MaxQueue() {
        max=new LinkedList<>();
        queue=new LinkedList<>();
    }

    public int max_value() {
         if(max.isEmpty())return -1;
         else return max.peekFirst();
    }

    public void push_back(int value) {//向队尾添加元素
        while(!max.isEmpty()&&max.peekLast()<value) max.pollLast();
        max.add(value);
        queue.add(value);
    }

    public int pop_front() {//删除并返回队首
        if(queue.isEmpty()) return -1;
        int ans=queue.pollFirst();
        if(ans==max.peekFirst()) max.pollFirst();
        return ans;
    }
}
public class solution59_II {

}
