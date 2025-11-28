package swordoffer1;

import java.util.Stack;

/**
 * @author Hs
 * @Date 2021/10/22 22:22
 */

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 * 思路：因为入栈顺序是确定的，使用栈来模拟压入弹出操作；
 *      根据模拟之后，栈是否为空，即可得出结果
 */
public class solution31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int num:pushed){
            stack.push(num);
            while (!stack.empty()&&(stack.peek()==popped[i])){
                stack.pop();
                i++;
            }
        }
        return stack.empty();
    }
}
