package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 13:48
 */

/**
 * 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 思路：深度优先搜索 将遇到的岛屿全部淹没
 */
public class Solution_200 {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                // 遇见岛屿，res+1
                if(grid[i][j]=='1') res++;
                dfs(grid,i,j);
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int i,int j){
        // 如果超出范围了就直接返回
        if(i>=grid.length||j>=grid[0].length||i<0||j<0) return;
        // 如果不是陆地就返回
        if(grid[i][j]=='0') return;
        // 淹没陆地
        grid[i][j]='0';
        // 深度优先搜索4个方向
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
