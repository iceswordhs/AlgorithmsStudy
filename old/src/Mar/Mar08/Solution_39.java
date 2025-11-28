package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 8:40
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 无重复元素 的整数数组candidates 和一个目标整数target，
 * 找出candidates中可以使数字和为目标数target 的 所有不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 *
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
 *
 * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
 *
 * 思路：这是一个组合问题，使用index标记可使用的数字的开始
 * 由于同一个数字可以重复选取 所以迭代时是i而不是i+1，即代表第i个数也可以使用
 */
public class Solution_39 {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        dfs(new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void dfs(List<Integer> nums,int[] candidates,int target,int index){
        if(target==0){
            list.add(new ArrayList<>(nums));
        }
        if(index==candidates.length) return;

        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target) continue;
            nums.add(candidates[i]);
            dfs(nums,candidates,target-candidates[i],i);
            nums.remove(nums.size()-1);
        }
    }
}
