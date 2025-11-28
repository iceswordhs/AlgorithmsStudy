package twenty_days.day9;

/**
 * @author Hs
 * @Date 2021/10/10 21:27
 *
 * 给你一个大小为 m x n 的二进制矩阵 grid 。
 *
 * 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在 水平或者竖直的四个方向上 相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。
 *
 * 岛屿的面积是岛上值为 1 的单元格的数目。
 *
 * 计算并返回 grid 中最大的岛屿面积。如果没有岛屿，则返回面积为 0 。
 *
 * 思路：凡是矩阵问题，一般需要定义两个数组表示四个方向。
 * 遍历初始节点相邻的位置，如果是岛屿，为防止重复遍历，将遍历过的岛屿置为0
 */
public class daoyudezuidamianji695 {
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    int max=0;
    int t=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    t=0;
                    dfs(grid,i,j);
                    if(max<t){
                        max=t;
                    }
                }
            }
        }
        return max;
    }
    void dfs(int[][] grid,int x,int y){
        if(grid[x][y]==1){
            t++;
            grid[x][y]=0;
        }else{
            return;
        }
        for(int i=0;i<4;i++){
            int mx=x+dx[i],my=y+dy[i];
            if(mx>=0&&mx<grid.length&&my>=0&&my<grid[0].length){
                dfs(grid,mx,my);
            }
        }
    }
}
