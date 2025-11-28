package twenty_days.day11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Hs
 * @Date 2021/10/12 19:33
 */

/**
 * 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
 *
 * 两个相邻元素间的距离为 1 。
 *
 * 思路：多源广度优先遍历：也就是每一个0都是一个源头，同时遍历他们各自四个方向的位置(就像树的每一层一样)。
 *      如果这个点没有被遍历过，它与0的距离就是前一个点与0的距离+1
 *      先遍历数组，如果为0，就将其放入队列中，否则置为-1，表示没有被遍历过。
 *      当队列不为空时，遍历队列的每个点，遍历每个点的四个方向，如果4个方向某些未遍历，这个方向上的点与0的距离就是这个点与0的距离+1
 */
public class juzhen542_01 {
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue=new LinkedList<>();
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i,j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] newNode=queue.poll();
            int mx,my;
            for(int i=0;i<4;i++){
                mx=newNode[0]+dx[i];
                my=newNode[1]+dy[i];
                if(mx>=0&&mx<m&&my>=0&&my<n&&mat[mx][my]==-1){
                    mat[mx][my]=mat[newNode[0]][newNode[1]]+1;
                    queue.offer(new int[]{mx,my});
                }

            }
        }
        return mat;
    }
}
