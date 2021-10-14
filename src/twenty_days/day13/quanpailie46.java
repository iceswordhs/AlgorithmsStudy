package twenty_days.day13;

import java.util.*;

/**
 * @author Hs
 * @Date 2021/10/14 19:26
 */

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 * 思路：深度优先搜索+回溯
 *      对于一个数组，每次都交换
 */
public class quanpailie46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int num : nums) {// 用来记录num[i]是否被使用过
            integers.add(num);
        }
        dfs(nums.length,integers,lists,0);
        return lists;
    }
    public void dfs(int n,List<Integer> integers,List<List<Integer>> lists,int begin){
        if(begin==n){
            lists.add(new ArrayList<>(integers));
            return;
        }
        for(int i=begin;i<n;i++){
            Collections.swap(integers,begin,i);
            System.out.println(integers);
            dfs(n,integers,lists,begin+1);
            Collections.swap(integers,begin,i);
        }
    }
}
