package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 22:06
 */

/**
 * 你有一个包含n 个节点的图。给定一个整数 n 和一个数组edges，其中edges[i] = [ai, bi]表示图中ai和bi之间有一条边。
 *
 * 返回 图中已连接分量的数目。
 *
 * 思路：并查集
 */
public class Solution_323 {
    int count;
    int[] fa;
    public int countComponents(int n, int[][] edges) {
        fa=new int[n];
        for(int i=0;i<n;i++){
            fa[i]=i;
        }
        count=n;
        for(int i=0;i<edges.length;i++){
            merge(edges[i][0],edges[i][1]);
        }
        find(0);
        return count;
    }
    int find(int x){
        if(x==fa[x]) return x;
        else{
            fa[x]=find(fa[x]);
            return fa[x];
        }
    }
    void merge(int i,int j){
        if(find(i)!=find(j)) {
            fa[find(i)]=j;
            count--;
        }
    }
}
