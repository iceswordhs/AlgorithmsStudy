package shiyiyue11.Nov_14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/11/14 18:42
 */

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
 *
 * 思路：当有左括号的时候先加左括号，然后回溯
 *      如果右括号数量大于左括号，添加右括号，回溯
 */
public class leetcode_22 {
    List<String> result=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> generateParenthesis(int n) {
        if(n==0) return result;
        dfs(n,n);
        return result;
    }
    void dfs(int left,int right){
        if(left==0&&right==0) {
            result.add(sb.toString());
            return;
        }
        if(left>0){
            sb.append('(');
            dfs(left-1,right);
            sb.deleteCharAt(sb.length()-1);
        }
        if (left<right){
            sb.append(')');
            dfs(left,right-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
