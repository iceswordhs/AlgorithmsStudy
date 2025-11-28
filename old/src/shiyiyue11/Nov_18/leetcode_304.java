package shiyiyue11.Nov_18;

/**
 * @author Hs
 * @Date 2021/11/18 21:27
 */

/**
 * 给定一个二维矩阵 matrix，以下类型的多个请求：
 *
 * 计算其子矩形范围内元素的总和，该子矩阵的 左上角 为 (row1,col1) ，右下角 为 (row2,col2) 。
 * 实现 NumMatrix 类：
 *
 * NumMatrix(int[][] matrix)给定整数矩阵 matrix 进行初始化
 * int sumRegion(int row1, int col1, int row2, int col2)返回
 * 左上角 (row1,col1)、右下角(row2,col2) 所描述的子矩阵的元素 总和 。
 *
 * 思路：前缀和 pre[i][j]表示左上角为[0][0],右下角为[i-1][j-1]的矩阵所有元素之和
 *      pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+matrix[i-1][j-1]
 *      然后返回pre[row2+1][col2+1]-pre[row1][col2+1]-pre[row2+1][col1]+pre[row1][col1]即可
 *      注意边界问题
 */
public class leetcode_304 {
    //int[][] pre;
    //int m,n;
    //public NumMatrix(int[][] matrix) {
    //    m=matrix.length;
    //    n=matrix[0].length;
    //    pre=new int[m+1][n+1];
    //    for(int i=1;i<=m;i++){
    //        for(int j=1;j<=n;j++){
    //            pre[i][j]=pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1]+matrix[i-1][j-1];
    //        }
    //    }
    //}
    //
    //public int sumRegion(int row1, int col1, int row2, int col2) {
    //    return pre[row2+1][col2+1]-pre[row1][col2+1]-pre[row2+1][col1]+pre[row1][col1];
    //}
}
