package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 14:51
 */

/**
 * 给你一个大小为 m x n 的二进制矩阵 grid 。
 *
 * 岛屿是由一些相邻的1(代表土地) 构成的组合，
 * 这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设grid 的四个边缘都被 0（代表水）包围着。
 *
 * 岛屿的面积是岛上值为 1 的单元格的数目。
 *
 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 *
 * 思路：淹没岛屿的时候记录一下岛屿的面积即可
 */
public class Solution_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) max=Math.max(max,dfs(grid,i,j));
            }
        }
        return max;
    }
    int dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)return 0;
        if(grid[i][j]==0) return 0;
        grid[i][j]=0;
        return dfs(grid,i+1,j)+
                dfs(grid,i-1,j)+
                dfs(grid,i,j+1)+
                dfs(grid,i,j-1)+1;
    }
}
