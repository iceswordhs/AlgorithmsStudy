package shiyiyue11.Nov_16;

/**
 * @author Hs
 * @Date 2021/11/16 21:49
 */

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 *
 * 思路：用up记录上面是第几行，down记录下面是第几行，left记录左边是第几行，right记录右边是第几行
 */
public class leetcode_59 {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int up=0,down=n-1,left=0,right=n-1,index=1;
        while(index<=n*n){
            for(int i=left;i<=right;i++){
                result[up][i]=index++;
            }
            up++;
            for(int i=up;i<=down;i++){
                result[i][right]=index++;
            }
            right--;
            for(int i=right;i>=left;i--){
                result[down][i]=index++;
            }
            down--;
            for(int i=down;i>=up;i--){
                result[i][left]=index++;
            }
            left++;
        }
        return result;
    }
}
