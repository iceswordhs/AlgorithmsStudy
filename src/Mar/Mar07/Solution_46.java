package Mar.Mar07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hs
 * @Date 2022/3/7 19:28
 */

/**
 *
 *
 * 思路：因为是个排列 排列和组合的区别就是
 *      组合 一个数在与剩余的数组合之后，就不需要再使用了
 *      排列 一个数排列之后，还要继续使用，出现在其他位置  但是在一个排列中，一个数出现一次后就不需要再出现了
 */
public class Solution_46 {
    List<List<Integer>> lists;
    public List<List<Integer>> permute(int[] nums) {
        lists=new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        for(int num:nums){
            integers.add(num);
        }
        dfs(new ArrayList<Integer>(),integers,0);
        return lists;
    }
    void dfs(List<Integer> path,List<Integer> integers,int pathLength){
        if(path.size()==integers.size()){
            lists.add(new ArrayList<>(path));
            return;
        }
        // 前面未使用过的数在这个位置都出现一次
        for(int i=pathLength;i<integers.size();i++){
            path.add(integers.get(i));
            // integers中的第i个数已经被使用过 将它换到第pathLength个位置去
            Collections.swap(integers,pathLength,i);
            dfs(path,integers,pathLength);
            Collections.swap(integers,pathLength,i);
            path.remove(path.size()-1);
        }
    }
}
