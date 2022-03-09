package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 15:02
 */

/**
 * 给你两个m x n的二进制矩阵grid1 和grid2，
 * 它们只包含0（表示水域）和 1（表示陆地）。
 * 一个 岛屿是由 四个方向（水平或者竖直）上相邻的1组成的区域。任何矩阵以外的区域都视为水域。
 *
 * 如果 grid2的一个岛屿，被 grid1的一个岛屿完全 包含，
 * 也就是说 grid2中该岛屿的每一个格子都被 grid1中同一个岛屿完全包含，
 * 那么我们称 grid2中的这个岛屿为 子岛屿。
 *
 * 请你返回 grid2中 子岛屿的 数目。
 *
 * 思路1：在深度优先遍历grid2中的岛屿的时候，在将当前岛屿淹没后，判断一下grid1中对应位置是否也是岛屿，
 *      如果不是返回false，否则返回 子dfs的结果并集
 *
 * 思路2：先遍历一下grid2，如果grid2中的某位置为岛屿，判断grid1的对应位置是否为岛屿，
 *       如果不是，那么grid2中这个岛屿不可能是子岛屿，就把这个岛屿淹掉
 *       然后再遍历一遍grid2，查询还剩余多少岛屿返回即可
 */
public class Solution_1905 {
    int[][] t;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res=0;
        t=grid1;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1&&dfs(grid2,i,j)) res++;
            }
        }
        return res;
    }

    boolean dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return true;
        if(grid[i][j]==0) return true;
        grid[i][j]=0;

        boolean b1=dfs(grid,i+1,j);
        boolean b2=dfs(grid,i-1,j);
        boolean b3=dfs(grid,i,j+1);
        boolean b4=dfs(grid,i,j-1);
        if(t[i][j]!=1) return false;
        // 只有所有的结果都为true才是子岛屿
        return b1&&b2&&b3&&b4;
    }
}
