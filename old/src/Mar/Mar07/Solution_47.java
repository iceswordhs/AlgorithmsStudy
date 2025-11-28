package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 23:20
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 *
 * 思路：怎样保证重复数字不会产生重复的序列？
 * 让相同数字出现的顺序不变即可 比如比如2',和2 ，2'只要永远出现在2的前面，就能保证不会有重复的
 */
public class Solution_47 {
    List<List<Integer>> lists;
    boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        // 标记该数是否被使用
        visited=new boolean[nums.length];

        // 当给的序列中有重复数字时，基本都要先排序
        Arrays.sort(nums);

        lists=new ArrayList<>();
        traverse(new ArrayList<Integer>(),nums);
        return lists;
    }
    // index之前的数都已经被使用
    public void traverse(List<Integer> path, int[] nums){
        if(path.size()==nums.length){
            lists.add(new ArrayList<>(path));
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            // 保证相同的数字出现的顺序一定 比如2',和2 ，2'只要永远出现在2的前面，就能保证不会有重复的
            if(i>0&&nums[i-1]==nums[i]&&!visited[i-1]) continue;
            path.add(nums[i]);
            visited[i]=true;
            traverse(path,nums);
            visited[i]=false;
            path.remove(path.size()-1);
        }
    }
}
