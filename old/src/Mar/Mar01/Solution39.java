package Mar.Mar01;

/**
 * @author Hs
 * @Date 2022/3/2 16:12
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
 * 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，
 * 并以列表形式返回。你可以按 任意顺序 返回这些组合。
 *
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
 *
 * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
 *
 * 思路：深度优先遍历 为了避免重复，添加一个参数index代表遍历到数组的第几个
 */
public class Solution39 {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        dfs(new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void dfs(List<Integer> nums, int[] candidates, int target, int index){
        if(index==candidates.length) return;
        if(target==0){
            list.add(new ArrayList<>(nums));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target-candidates[i]<0) continue;
            nums.add(candidates[i]);
            dfs(nums,candidates,target-candidates[i],i);
            nums.remove(nums.size()-1);
        }
    }
}
