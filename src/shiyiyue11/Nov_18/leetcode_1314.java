package shiyiyue11.Nov_18;

/**
 * @author Hs
 * @Date 2021/11/18 20:39
 */

/**
 * 给你一个m x n的矩阵mat和一个整数 k ，请你返回一个矩阵answer，
 * 其中每个answer[i][j]是所有满足下述条件的元素mat[r][c] 的和：
 *
 * i - k <= r <= i + k,
 * j - k <= c <= j + k 且
 * (r, c)在矩阵内。
 *
 * 思路：其实就是求i-k~i+k,j-k~j+k这个矩阵中的所有值之和
 *      使用二维前缀和可以大幅简化计算  pre[i][j]表示以[0,0]为左上角，[i-1,j-1]为左下角的矩阵和
 *      pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+mat[i-1][j-1]
 *      计算出前缀和数组后，只需要考虑数组越界问题即可。
 */
public class leetcode_1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int x=mat.length,y=mat[0].length;
        // 大小比原来大一号，这样计算的时候就不需要做额外的处理了，不然还要考虑数组越界的问题
        // 前缀和基本都是这样处理，比原来大一号，可以避免处理起点
        int[][] pre=new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+mat[i-1][j-1];
            }
        }
        // 注意： 范围是pre[i+k+1][j+k+1]-pre[i+k+1][j-k]-pre[i-k][j+k+1]+pre[i-k][j-k]
        //       而不是pre[i+k+1][j+k+1]-pre[i+k+1][j-k+1]-pre[i-k+1][j+k+1]+pre[i-k+1][j-k+1]
        //       因为mat[i-k][j-k]是包含在里面的，所以右上角的前缀和应该是pre[i-k][j-k]而不是pre[i-k+1][j-k+1]
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                mat[i][j]=get(pre,x,y,i+k+1,j+k+1)-get(pre,x,y,i+k+1,j-k)-get(pre,x,y,i-k,j+k+1)+get(pre,x,y,i-k,j-k);
            }
        }
        return mat;

    }
    public int get(int[][] pre,int x,int y,int x1,int y1){
        int m=Math.max(Math.min(x1,x),0);
        int n=Math.max(Math.min(y1,y),0);
        return pre[m][n];
    }
}
