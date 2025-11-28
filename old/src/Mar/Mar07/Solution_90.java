package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 23:28
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 *
 *
 * 思路：先排序 然后如果在未出现的数中，有等于前一个数的，跳过
 */
public class Solution_90 {
    List<List<Integer>> lists;
    boolean[] vis;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        lists=new ArrayList<>();
        vis=new boolean[nums.length];
        Arrays.sort(nums);
        traverse(new ArrayList<>(),nums,0);
        return lists;
    }
    public void traverse(ArrayList<Integer> path, int[] nums, int index){
        lists.add(new ArrayList<>(path));

        for(int i=index;i<nums.length;i++){
            if(vis[i]) continue;
            if(i>index&&nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            traverse(path,nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
