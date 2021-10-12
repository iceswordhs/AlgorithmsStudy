package twenty_days.day11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Hs
 * @Date 2021/10/12 20:30
 */

/**
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 *
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 *
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 *
 *
 * 思路：多源广度优先搜索：遍历数组，将所有坏橘子(值为2)加入到建立的数组队列中，
 *      当队列不为空时，遍历队列，遍历队列中每一个节点的4个方向，如果遇到好橘子，就把它变成坏橘子，并放到队列中
 *      用一个int类型的变量flag判断这一分钟是否有新的坏橘子，如果有flag=0，继续遍历队列
 *      如果没有，就退出
 *      使用cnt记录好橘子的个数，如果最后有好橘子返回-1
 */
public class fulandejuzhi994 {
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int cnt=0;// 记录好橘子的个数
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                } else if(grid[i][j]==1){
                    cnt++;
                }
            }
        }
        int minutes=0;
        int flag=0;//记录每分钟是否有新的腐烂的橘子
        boolean empty=queue.isEmpty();
        while(!empty){
            int count=queue.size();
            while(count>0){
                int[] newNode=queue.poll();
                count--;
                int mx,my;
                for(int i=0;i<4;i++){
                    mx=newNode[0]+dx[i];
                    my=newNode[1]+dy[i];
                    if(mx>=0&&mx<grid.length&&my>=0&&my<grid[0].length&&grid[mx][my]==1){
                        grid[mx][my]=2;
                        flag=1;
                        cnt--;
                        queue.add(new int[]{mx,my});
                    }
                }
            }
            if(flag==1){
                minutes++;
                empty=queue.isEmpty();
                flag=0;
            } else empty=true;
        }
        if (cnt>0) return -1;
        return minutes;
    }
}
