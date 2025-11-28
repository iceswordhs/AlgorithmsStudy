package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 15:37
 */

import shiyiyue11.utils.TreeNode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 学习dijkstra算法
 */
public class DijkstraStudy {
    List<Integer>[] graph;

    int[] dijkstra(int start,List<Integer>[] graph){
        // 图中节点的个数
        int V=graph.length;
        // 记录最短路径的权重，你可以理解为dptable
        // 定义：distTo[i]的值就是节点start到达节点i的最短路径权重和
        int[] distTo=new int[V];
        Arrays.fill(distTo,Integer.MAX_VALUE);
        distTo[start]=0;

        // 优先级队列，distFromStart较小的排在前面
        Queue<State> pq=new PriorityQueue<>((a,b)-> a.distFromStart-b.distFromStart);

        pq.offer(new State(start,0));

        while(!pq.isEmpty()){
            State curState=pq.poll();
            int curNodeID=curState.id;
            int curDisFromStart=curState.distFromStart;

            if (curDisFromStart>distTo[curNodeID]){
                continue;
            }
            // 将curNode的相邻节点装入队列
            for (int nextNodeID : adj(curNodeID)){
                // 看看从curNode达到nextNode的距离是否会更短
                int distToNextNode=distTo[curNodeID]+weight(curNodeID,nextNodeID);
                // 如果更短，将节点放入优先队列
                if (distTo[nextNodeID]>distToNextNode){
                    distTo[nextNodeID]=distToNextNode;
                    pq.offer(new State(nextNodeID,distToNextNode));
                }
            }
        }
        return distTo;
    }

    // 返回节点 from 到节点 to 之间的边的权重
    int weight(int from, int to){
        return 0;
    }

    // 输入节点 s 返回 s 的相邻节点
    List<Integer> adj(int s){
        return graph[s];
    }
}
class State{
    int id;
    int distFromStart;

    State(int id,int distFromStart){
        this.id=id;
        this.distFromStart=distFromStart;
    }
}