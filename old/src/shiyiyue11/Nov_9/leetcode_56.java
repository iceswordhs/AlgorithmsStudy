package shiyiyue11.Nov_9;

/**
 * @author Hs
 * @Date 2021/11/9 21:57
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 * 思路：按照starti进行排序，然后冲前往后进行合并
 */
public class leetcode_56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][2];
        Arrays.sort(intervals,(intervals1,intervals2)->intervals1[0]-intervals2[0]);
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int l=intervals[i][0],r=intervals[i][1];
            if(list.size()==0||list.get(list.size()-1)[1]<l){//如果list为空或者最后一个区间的左边界小于当前右边界
                list.add(new int[]{l,r});
            }else{
                int t=list.get(list.size()-1)[1];
                list.get(list.size()-1)[1]=t>r?t:r;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
