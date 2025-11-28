package shiyiyue11.Nov_21;

/**
 * @author Hs
 * @Date 2021/11/21 15:31
 */

/**
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
 *
 * 思路1：深度优先搜索  时间复杂度O(n) 空间复杂度取决于树的深度
 *
 * 思路2：广度优先遍历
 */
public class leetcode_559 {
    // 深度优先遍历
    //public int maxDepth(Node root) {
    //    return dfs(root);
    //}
    //public int dfs(Node root){
    //    if(root==null){
    //        return 0;
    //    }
    //    int max=0;
    //    for(int i=0;i<root.children.size();i++){
    //        max=Math.max(dfs(root.children.get(i)),max);
    //    }
    //    return max+1;
    //}

    //广度优先遍历
    //public int maxDepth(Node root) {
    //    Queue<Node> queue=new LinkedList<>();
    //    int depth=0;
    //    if(root!=null)
    //        queue.add(root);
    //    while(!queue.isEmpty()){
    //        depth++;
    //        int size=queue.size();
    //        while(size>0){
    //            Node node=queue.poll();
    //            for(int i=0;i<node.children.size();i++){
    //                if(node.children.get(i)!=null)
    //                    queue.add(node.children.get(i));
    //            }
    //            size--;
    //        }
    //    }
    //    return depth;
    //}
}
