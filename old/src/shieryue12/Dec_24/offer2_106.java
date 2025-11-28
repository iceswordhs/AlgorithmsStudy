package shieryue12.Dec_24;

/**
 * @author Hs
 * @Date 2021/12/24 15:37
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * 判断无向图是否是二分图
 *
 * 二分图 定义：如果能将一个图的节点集合分割成两个独立的子集 A 和 B ，
 * 并使图中的每一条边的两个节点一个来自 A 集合，一个来自 B 集合，就将这个图称为 二分图 。
 *
 * 该无向图同时具有以下属性：
 * 不存在自环（graph[u] 不包含 u）。
 * 不存在平行边（graph[u] 不包含重复值）。
 * 如果 v 在 graph[u] 内，那么 u 也应该在 graph[v] 内（该图是无向图）
 * 这个图可能不是连通图，也就是说两个节点 u 和 v 之间可能不存在一条连通彼此的路径。
 *
 * 思路：遍历图，如果一个节点没有被遍历过，将其涂为蓝色，然后将下一个变为红色，依次类推
 *      如果下一个节点已经有颜色，并且为蓝色，就返回false
 *
 *      广度优先遍历：遍历节点，如果节点未被访问过，以这个节点为源进行广度优先遍历
 */
public class offer2_106 {
    // 广度优先遍历
    //int[] visited;
    //int flag=1;
    //// 输入的是一个邻接链表 依次遍历即可
    //public boolean isBipartite(int[][] graph) {
    //    visited=new int[graph.length];
    //    for(int i=0;i<graph.length;i++){ // 因为图有可能不是连通图，所以需要遍历所有节点
    //        if(visited[i]==0){
    //            // 广度优先遍历
    //            Deque<Integer> deque=new LinkedList<>();
    //            deque.add(i);
    //            visited[i]=1;
    //            while(deque.size()!=0){
    //                int node=deque.poll();
    //                // 每遍历一个节点的所有连线时，都要把flag变为和此节点不同的颜色
    //                if(visited[node]==1) flag=2;
    //                else flag=1;
    //                for(int j=0;j<graph[node].length;j++){
    //                    if(visited[graph[node][j]]==0){
    //                        visited[graph[node][j]]=flag;
    //                        deque.add(graph[node][j]);
    //                    }else{
    //                        if(visited[graph[node][j]]!=flag) return false;
    //                    }
    //                }
    //            }
    //        }
    //    }
    //    return true;
    //}

    // 深度优先遍历
    int[] visited;
    boolean success=true;
    public boolean isBipartite(int[][] graph) {
        visited=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(success==false) return success;
            if(visited[i]==0){
                dfs(i,graph,1);
            }
        }
        return success;
    }
    public void dfs(int node,int[][] graph,int flag){
        if(visited[node]==0){
            visited[node]=flag==1?2:1;
        }else {
            if(visited[node]==flag){
                success=false;
            }
            return;
        }
        for(int i=0;i<graph[node].length;i++){
            dfs(graph[node][i],graph,visited[node]);
            if(success==false) return;
        }
    }
}
