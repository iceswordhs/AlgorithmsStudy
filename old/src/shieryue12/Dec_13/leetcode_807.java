package shieryue12.Dec_13;

/**
 * @author Hs
 * @Date 2021/12/13 20:49
 */

/**
 * 给你一座由 n x n 个街区组成的城市，每个街区都包含一座立方体建筑。给你一个下标从 0 开始的 n x n 整数矩阵 grid ，其中 grid[r][c] 表示坐落于 r 行 c 列的建筑物的 高度 。
 *
 * 城市的 天际线 是从远处观察城市时，所有建筑物形成的外部轮廓。从东、南、西、北四个主要方向观测到的 天际线 可能不同。
 *
 * 我们被允许为 任意数量的建筑物 的高度增加 任意增量（不同建筑物的增量可能不同） 。 高度为 0 的建筑物的高度也可以增加。然而，增加的建筑物高度 不能影响 从任何主要方向观察城市得到的 天际线 。
 *
 * 在 不改变 从任何主要方向观测到的城市 天际线 的前提下，返回建筑物可以增加的 最大高度增量总和 。
 *
 * 思路：从前面和从后面看到的是一样的，从左边和从右边看到的也是一样的
 *      从前后看到的是每列最大的值，只要不改变每列最大的值，看到的景像就不会改变
 *      从左右看到的是每行最大的值，只要不改变每行最大的值，看到的镜像就不会改变
 *      所以只需要记录每行每列的最大值，将所有的值加到 每行每列的最大值的较小值即可
 */
public class leetcode_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rowMax=new int[n];
        int[] colMax=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowMax[i]=Math.max(rowMax[i],grid[i][j]);
                colMax[j]=Math.max(colMax[j],grid[i][j]);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans+=Math.min(rowMax[i],colMax[j])-grid[i][j];
            }
        }
        return ans;
    }
}
