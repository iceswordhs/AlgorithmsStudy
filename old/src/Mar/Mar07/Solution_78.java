package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 17:22
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 * 思路：经典集合问题  集合，代表元素不能重复，集合也不能重复
 */
public class Solution_78 {
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        traverse(lists,nums,0);
        return lists;
    }
    void traverse(List<List<Integer>> lists, int[] nums, int index){
        // 记录路径
        lists.add(new ArrayList<>(path));

        for(int i=index;i<nums.length;i++){
            path.add(nums[i]);
            // 这里是i+1而不是index+1  这样后面就只能用前面没有选过的值了，
            // 如果是index+1，所有的循环使用的都是同一批数  下一行迭代每次循环都是相同的
            traverse(lists,nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
