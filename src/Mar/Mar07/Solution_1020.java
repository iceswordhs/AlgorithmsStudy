package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 14:42
 */

/**
 * 给你一个大小为 m x n 的二进制矩阵 grid ，其中 0 表示一个海洋单元格、1 表示一个陆地单元格。
 *
 * 一次 移动 是指从一个陆地单元格走到另一个相邻（上、下、左、右）的陆地单元格或跨过 grid 的边界。
 *
 * 返回网格中 无法 在任意次数的移动中离开网格边界的陆地单元格的数量。
 *
 * 思路：先将未被0包围的1变成0  然后遍历一下还剩多少个1就行了
 */
public class Solution_1020 {
    public int numEnclaves(int[][] grid) {
        // 等于求岛屿问题 只是这里是求岛屿面积而已
        int res=0;
        for(int i=0;i<grid.length;i++){
            dfs(grid,i,0);
            dfs(grid,i,grid[0].length-1);
        }
        for(int i=0;i<grid[0].length;i++){
            dfs(grid,0,i);
            dfs(grid,grid.length-1,i);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    res++;
                }
            }
        }
        return res;
    }

    public int dfs(int[][] grid,int i,int j){
        int res=0;
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return 0;
        }
        if(grid[i][j]==0) return 0;
        grid[i][j]=0;
        res++;
        res+=dfs(grid,i+1,j);
        res+=dfs(grid,i-1,j);
        res+=dfs(grid,i,j+1);
        res+=dfs(grid,i,j-1);
        return res;
    }
}
