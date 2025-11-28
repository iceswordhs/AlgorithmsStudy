package twenty_days.day15;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Hs
 * @Date 2021/10/16 20:11
 */

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 *
 * 思路：广度优先搜索(较慢)
 *      深度优先搜索(较快) 创建一个boolean数组，从0,0开始dfs，
 *      如果不满足条件直接返回，否则，count++，并且标记已经访问过，
 *      并且分别向右dfs(x+1,y)和向上dfs(x,y+1)进行深搜
 */
public class jiqirendeyundongfanwei_offer_13 {
    // 广度优先搜索
    //int[] dx={1,0,-1,0};
    //int[] dy={0,1,0,-1};
    //public int movingCount(int m, int n, int k) {
    //    int count=0;
    //    Deque<int[]> integers=new LinkedList<>();
    //    boolean[][] vis=new boolean[m][n];
    //    vis[0][0]=true;
    //    count++;
    //    integers.add(new int[]{0,0});
    //    while(!integers.isEmpty()){
    //        int[] node=integers.poll();
    //        int x=node[0];
    //        int y=node[1];
    //        for(int i=0;i<4;i++){
    //            int mx=x+dx[i];
    //            int my=y+dy[i];
    //            if(mx<0||mx>=m||my<0||my>=n||vis[mx][my]||(get(mx)+get(my))>k){
    //                continue;
    //            }
    //            integers.add(new int[]{mx,my});
    //            vis[mx][my]=true;
    //            count++;
    //        }
    //    }
    //    return count;
    //}
    //public int get(int n){
    //    int ans=0;
    //    while(n!=0){
    //        ans+=n%10;
    //        n=n/10;
    //    }
    //    return ans;
    //}

    // 深度优先搜索
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    boolean[][] vis;
    int count=0;
    public int movingCount(int m, int n, int k) {
        vis=new boolean[m][n];
        dfs(0,0,k,m,n);
        return count;
    }
    public void dfs(int x,int y,int k,int m,int n){
        if(x>=m||y>=n||vis[x][y]||(get(x)+get(y))>k){
            return;
        }
        vis[x][y]=true;
        count++;
        dfs(x+1,y,k,m,n);
        dfs(x,y+1,k,m,n);
    }
    public int get(int n){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
}
