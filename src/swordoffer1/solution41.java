package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/28 19:04
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 *
 * 例如，
 *
 * [2,3,4] 的中位数是 3
 *
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 *
 * 设计一个支持以下两种操作的数据结构：
 *
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 *
 * 思路：用ArrayList存储，每次插入时都比较一下，维持排序队列。缺点：时间复杂度较高
 *
 * 思路2：使用PriorityQueue，这是一个优先级队列，最小值在队首
 *      如果在创建时new PriorityQueue<>((x,y)->(y-x))，就变成大顶堆。最大值在队首。
 *      用两个PriorityQueue存储较小的一半和较大的一半。
 *
 */
public class solution41 {
    /**
     * 思路1：使用ArrayList，每次插入时排序
     */
    /** initialize your data structure here. */
    //ArrayList<Integer> integers;
    //public solution41() {
    //    integers = new ArrayList<>();
    //}
    //
    //public void addNum(int num) {
    //    if(integers.size()==0){
    //        integers.add(num);
    //        return;
    //    }
    //    for(int i=0;i<integers.size();i++){
    //        if(integers.get(i)>num){
    //            integers.add(i,num);
    //            return;
    //        }
    //    }
    //    integers.add(num);
    //}
    //
    //public double findMedian() {
    //    double result=0;
    //    if((integers.size()&1)==0) {
    //        Integer integer = integers.get(integers.size() / 2);
    //        Integer integer1 = integers.get((integers.size() / 2) - 1);
    //        result = (integer + integer1) * 1.0 / 2;
    //    }else {
    //        result=integers.get((integers.size()-1)/2);
    //    }
    //    return result;
    //}
    /**
     * 思路2：使用两个PriorityQueue
     */
    PriorityQueue<Integer> A,B;
    public solution41() {
        A=new PriorityQueue<>();// 小顶堆 存储较大的部分
        B=new PriorityQueue<>((x,y)->(y-x));// 变成大顶堆 存储较小的部分，在数字数量为奇数时多存储一个
    }

    public void addNum(int num) {
        if (A.size()==B.size()){
            A.add(num);
            B.add(A.poll());
        }else {
            B.add(num);
            A.poll();
        }
    }

    public double findMedian() {
        if (A.size()!=B.size()){
            return (double) A.peek();
        }else {
            return (A.peek()+B.peek())*1.0/2;
        }
    }
}
