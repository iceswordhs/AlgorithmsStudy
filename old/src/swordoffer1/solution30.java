package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/22 20:39
 */

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 * 思路：使用两个栈，栈A用来存储存入的数，栈B用来存储最小的值，包括与最小值相等的值；
 *      当push时，A.add，如果B为空或者最小值大于等于B最上面的值时，将值放入B
 *      当Pop时，如果A中pop的值等于B中最顶上的值，将B也pop
 *
 */
public class solution30 {
    //Stack<Integer> A,B;
    ///** initialize your data structure here. */
    //public MinStack() {
    //    A=new Stack<>();
    //    B=new Stack<>();
    //}
    //
    //public void push(int x) {
    //    A.add(x);
    //    if(B.empty()||B.peek()>=x){// 这里是将等于最小值的数也放进去
    //        B.add(x);
    //    }
    //}
    //
    //public void pop() {
    //    if(A.pop().equals(B.peek()))// 如果上面不是>=，那么这时候就会出问题；当有两个最小的数时，B就会不存在最小的值，会出问题
    //        B.pop();
    //}
    //
    //public int top() {
    //    return A.peek();
    //}
    //
    //public int min() {
    //    return B.peek();
    //}
}
