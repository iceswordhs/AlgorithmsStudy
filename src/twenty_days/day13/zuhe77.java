package twenty_days.day13;

/**
 * @author Hs
 * @Date 2021/10/14 16:22
 */

import java.util.*;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 * 思路：从1-n中取k个不同的数进行组合，返回每一种结果
 *
 *
 */
public class zuhe77 {
    public List<List<Integer>> combine(int n,int k){
        Deque<Integer> deque=new ArrayDeque<>();
        ArrayList<List<Integer>> lists = new ArrayList<>();
        dfs(n,k,1,deque,lists);
        return lists;
    }
    public void dfs(int n,int k,int begin,Deque<Integer> path,List<List<Integer>> listList){
        if(path.size()==k){// 当deque中的数字达到k个后，这就是一个组合
            listList.add(new ArrayList<>(path));
            return;
        }
        // 如果deque中的数字不够
        // 这时候可以剪枝  数组剩余 n-i+1个数(当i=4的时候，数组中剩余n-4+1=1个数字，4也是一个数字)
        //               还需要k-path.size个数   所以需要 n-i+1>=k-path.size() 所以 i<=n-(k-path.size())
        for (int i=begin;i<=n - (k - path.size()) ;i++){
            path.add(i);
            System.out.println("递归之前"+path);
            dfs(n,k,i+1,path,listList);
            System.out.println("递归之后"+path);
            path.removeLast();// 将deque回溯到之前的状态 这样循环的结果就是path中的数字加上循环的每一个i，
                              // 上一个i不会对下一个i造成影响
        }
    }
}
