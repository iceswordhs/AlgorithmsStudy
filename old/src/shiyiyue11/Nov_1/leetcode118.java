package shiyiyue11.Nov_1;

/**
 * @author Hs
 * @Date 2021/11/1 20:04
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 * 思路：遍历numRows次，每次创建一个List
 *      唯一需要注意的是边界的处理，如果是第一个节点或者最后一个节点，就直接添加一个节点1
 *      否则添加上一个List的对应节点；
 *      这样也避免了第一个List没有上一个List的问题
 */
public class leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ints=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    ints.add(1);
                }else{
                    ints.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(ints);
        }
        return result;
    }
}
