package Mar.Mar07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hs
 * @Date 2022/3/7 17:50
 */

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 * 思路：回溯即可 由于是组合，即代表着一个数出现一次 而且内部不分顺序
 *      每次取一个数，然后
 */
public class Solution_77 {
    List<Integer> path=new ArrayList<>();
    int n,k;
    public List<List<Integer>> combine(int nn,int kk){
        List<List<Integer>> lists = new ArrayList<>();
        n=nn;
        k=kk;
        dfs(lists,path,1);
        return lists;
    }
    public void dfs(List<List<Integer>> lists,List<Integer> path,int index){
        if(path.size()==k){
            lists.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<=n;i++){
            path.add(i);
            dfs(lists,path,i+1);
            path.remove(path.size()-1);
        }
    }
}
