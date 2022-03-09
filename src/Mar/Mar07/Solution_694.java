package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 15:40
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个非空 01 二维数组表示的网格，
 * 一个岛屿由四连通（上、下、左、右四个方向）的 1 组成，你可以认为网格的四周被海水包围。
 *
 * 请你计算这个网格中共有多少个形状不同的岛屿。两个岛屿被认为是相同的，
 * 当且仅当一个岛屿可以通过平移变换（不可以旋转、翻转）和另一个岛屿重合。
 *
 * 思路：对于形状相同的岛屿，我们遍历的顺序肯定是一样的
 *      所以，只需要把岛屿序列化即可
 */
public class Solution_694 {
    public int numDistinctIslands(int[][] grid) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    StringBuilder sb=new StringBuilder();
                    dfs(grid,i,j,sb,777);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
    void dfs(int[][] grid,int i,int j,StringBuilder sb,int dir){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
        if(grid[i][j]==0) return;

        // 前序遍历位置 进入grid[i][j]
        grid[i][j]=0;
        sb.append(dir).append(',');
        dfs(grid,i+1,j,sb,1);
        dfs(grid,i-1,j,sb,2);
        dfs(grid,i,j+1,sb,3);
        dfs(grid,i,j-1,sb,4);
        // 后序遍历位置 离开grid[i][j]
        sb.append(-dir).append(',');
    }
}
