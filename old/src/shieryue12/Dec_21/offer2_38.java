package shieryue12.Dec_21;

/**
 * @author Hs
 * @Date 2021/12/21 22:23
 */

import java.util.Stack;

/**
 * 请根据每日 气温 列表 temperatures ，重新生成一个列表，
 * 要求其对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。
 * 如果气温在这之后都不会升高，请在该位置用0 来代替。
 *
 * 思路：使用栈，存储每个温度的数组下标，
 * 如果第i天的温度高于栈顶，就弹出栈顶，并将栈顶的需要等待的天数设为i-栈顶，直到栈为空或者栈顶大于第i天
 * 遍历结束后，如果栈不为空，将栈中对应下标需等待的天数设为0
 */
public class offer2_38 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length=temperatures.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<length;i++){
            if(stack.size()==0){
                stack.add(i);
            }else{
                if(temperatures[stack.peek()]>=temperatures[i]){
                    stack.add(i);
                }else{
                    int t;
                    while(stack.size()>0&&temperatures[stack.peek()]<temperatures[i]){
                        t=i-stack.peek();
                        temperatures[stack.pop()]=t;
                    }
                    stack.add(i);
                }
            }
        }
        while(stack.size()>0){
            temperatures[stack.pop()]=0;
        }
        return temperatures;
    }
}
