package swordoffer2;

import java.util.ArrayList;
import java.util.List;

/*
与前一题相同都是滑动窗口类型问题

输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

思路：所有的数都是小于target的
     所有的数都是小于等于target/2+1的
     假设有n个数，第一个数值为k 和为n*k+(k+n-1)*n>>1
 */
public class solution57_II {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec=new ArrayList<>();
        int l=1;
        int r=2;
        for(;l<r;){
            int num=(l+r)*(r-l+1)/2;
            if(num<target){
                r++;
            }else if(num>target){
                l++;
            }else {
                int[] res=new int[r-l+1];
                for(int i=l;i<=r;i++){
                    res[i-l]=i;
                }
                vec.add(res);
                l++;
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }
}
