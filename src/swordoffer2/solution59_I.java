package swordoffer2;

import java.util.Deque;
import java.util.LinkedList;

public class solution59_I {
    public int[] maxSlidingWindow(int[] nums, int k) {//利用单调队列来写
        if(nums.length==0||k==0) return new int[0];
        Deque<Integer> deque=new LinkedList<>();
        int[] result=new int[nums.length-k+1];
        for(int i=0;i<k;i++){//当窗口未形成时
            while (!deque.isEmpty()&&deque.peekLast()<nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
        }
        result[0]=deque.peekFirst();//将第一个窗口的最大值放入结果数组中
        for(int i=k;i<nums.length;i++){//窗口形成后
            if(deque.peekFirst()==nums[i-k]) deque.removeFirst();//如果队列的首位是窗口移除的元素，移除队列首位
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]) deque.removeLast();
            //deque.addLast(nums[i]);
            deque.offerLast(nums[i]);//offerLast更快 add最快
            result[i-k+1]=deque.peekFirst();
        }
        return result;
    }
    /*
    需要链接元素到队列尾时优先用offer()
    查看元素优先使用peek()
    删除元素优先使用poll()

    特别情况：
    想要在指定索引位置链接元素可以使用add(int index, E element)
    获取指定索引的元素可以使用get(int index)
    修改指定索引的元素可以使用set(int index, E newElement)

     */
}
