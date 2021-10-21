package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/21 20:16
 */

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 思路：用l表示左端，r表示右端；low表示低层，high表示高层
 * 按照从左往右，从上到下，从右到左，从下至上的顺序进行遍历
 */
public class solution29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0) return new int[0];
        int high=matrix.length-1;
        int low=0;
        int r=matrix[0].length-1;
        int l=0;
        int[] result=new int[matrix.length*matrix[0].length];
        int t=0;
        while(true){
            for(int i=l;i<=r;i++){
                result[t++]=matrix[low][i];
            }
            if (++low>high) break;


            for (int i=low;i<=high;i++){
                result[t++]=matrix[i][r];
            }
            if (--r<l) break;

            for (int i=r;i>=l;i--){
                result[t++]=matrix[high][i];
            }
            if (--high<low) break;

            for (int i=high;i>=low;i--){
                result[t++]=matrix[i][l];
            }
            if (++l>r) break;

        }
        return result;
    }
}
