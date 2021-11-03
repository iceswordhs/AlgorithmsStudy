package shiyiyue11.Nov_3;

/**
 * @author Hs
 * @Date 2021/11/3 16:59
 */

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *  思路：用一个栈解决问题
 */
public class leetcode20 {
    public boolean isValid(String s) {
        if(s==null||s.length()==0) return true;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(stack.size()==0){
                stack.add(c);
            }else if((stack.peek()=='('&&c==')')||
                    (stack.peek()=='['&&c==']')||(stack.peek()=='{'&&c=='}')){
                stack.pop();
            }else{
                stack.add(c);
            }
        }
        return stack.size() == 0;
    }
}
