package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 14:20
 */

/**
 * 二维矩阵 grid由 0（土地）和 1（水）组成。
 * 岛是由最大的4个方向连通的 0组成的群，封闭岛是一个完全 由1包围（左、上、右、下）的岛。
 *
 * 请返回 封闭岛屿 的数目。
 *
 * 思路：由于只有被1围绕的0才是岛屿，所以先把没被围绕的0淹没掉变成1
 *      然后再计算岛屿数量即可
 *
 */
public class Solution_1254 {
    public int closedIsland(int[][] grid) {
        int res=0;
        // 淹没左右临边
        for(int i=0;i<grid.length;i++){
            dfs(grid,i,0);
            dfs(grid,i,grid[0].length-1);
        }
        // 淹没上下临边
        for(int i=0;i<grid[0].length;i++){
            dfs(grid,0,i);
            dfs(grid,grid.length-1,i);
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) {
                    res++;
                    dfs(grid,i,j);
                }
            }
        }

        return res;
    }
    public void dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
        if(grid[i][j]==1)return;
        grid[i][j]=1;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
