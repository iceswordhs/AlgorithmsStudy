package shiyiyue11.Nov_16;

/**
 * @author Hs
 * @Date 2021/11/16 21:59
 */

/**
 * 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 * 思路：观察发现，第一行第x个正好是翻转后最后一列第x行
 *      用一个数组暂存结果
 *      用x记录行数，那么原数组的第0行就对应新数组的第x-1列 newarray[j][--x]=matrix[i][j]
 */
public class leetcode_48 {
    public void rotate(int[][] matrix) {
        int x=matrix.length,y=matrix[0].length;
        int[][] newarray=new int[x][y];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<y;j++){
                newarray[j][--x]=matrix[i][j];
            }
        }
        x=matrix.length;
        y=matrix[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                matrix[i][j]=newarray[i][j];
            }
        }
    }
}
