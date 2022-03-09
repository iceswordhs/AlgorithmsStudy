package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 16:53
 */

import java.util.*;

/**
 * 有 n 个网络节点，标记为1到 n。
 *
 * 给你一个列表times，表示信号经过 有向 边的传递时间。times[i] = (ui, vi, wi)，其中ui是源节点，vi是目标节点，
 * wi是一个信号从源节点传递到目标节点的时间。
 *
 * 现在，从某个节点K发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回-1 。
 *
 * 思路：迪杰斯特拉算法 先将int[][]转换为邻接表
 */
public class Solution_743 {
    class State{
        int id;
        int distFromStart;

        State(int id,int distFromStart){
            this.id=id;
            this.distFromStart=distFromStart;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new LinkedList[n+1];
        for(int i=1;i<=n;i++){
            graph[i]=new LinkedList<>();
        }
        for(int[] edge:times){
            int from=edge[0];
            int to=edge[1];
            int weight=edge[2];
            graph[from].add(new int[]{to,weight});
        }
        // 使用迪杰斯特拉算法找到k节点到所有节点的最短路径
        int[] distTo=dijkstra(k,graph);

        int res=0;
        // 在最短路径中找到最长的
        for(int i=1;i<distTo.length;i++){
            if(distTo[i]==Integer.MAX_VALUE){
                return -1;
            }
            res=Math.max(res,distTo[i]);
        }
        return res;
    }

    int[] dijkstra(int start, List<int[]>[] graph){
        // 图中节点的个数
        int V=graph.length;
        // 记录最短路径的权重，你可以理解为dptable
        // 定义：distTo[i]的值就是节点start到达节点i的最短路径权重和
        int[] distTo=new int[V];
        Arrays.fill(distTo,Integer.MAX_VALUE);
        distTo[start]=0;

        // 优先级队列，distFromStart较小的排在前面
        Queue<State> pq=new PriorityQueue<>((a, b)-> a.distFromStart-b.distFromStart);

        pq.offer(new State(start,0));

        while(!pq.isEmpty()){
            State curState=pq.poll();
            int curNodeID=curState.id;
            int curDisFromStart=curState.distFromStart;

            if (curDisFromStart>distTo[curNodeID]){
                continue;
            }
            // 将curNode的相邻节点装入队列
            for (int[] nextNodeEdge : graph[curNodeID]){
                int nextNodeID=nextNodeEdge[0];
                // 看看从curNode达到nextNode的距离是否会更短
                int distToNextNode=distTo[curNodeID]+nextNodeEdge[1];
                // 如果更短，将节点放入优先队列
                if (distTo[nextNodeID]>distToNextNode){
                    distTo[nextNodeID]=distToNextNode;
                    pq.offer(new State(nextNodeID,distToNextNode));
                }
            }
        }
        return distTo;
    }

}
