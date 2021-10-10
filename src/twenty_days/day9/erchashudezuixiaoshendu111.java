package twenty_days.day9;

/**
 * @author Hs
 * @Date 2021/10/10 21:17
 *
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明：叶子节点是指没有子节点的节点。
 *
 *
 * 思路：深度优先就是找到每个节点的最小深度，要注意如果节点为null，返回0，
 * 节点不为null，尽量不要返回0+1，除非两个子节点都为null才能返回0+1。因为null节点不算做深度
 *
 * 广度优先算法：用一个queue，先将根节点放进去，用count表示queue中数据的个数，遍历queue中的每个节点，
 * 并向其中添加节点的子节点，但是子节点不遍历。每遍历一次queue就等于遍历了一层树
 */
public class erchashudezuixiaoshendu111 {
    //深度优先算法  较慢
    //public int minDepth(TreeNode root) {
    //    return minTreeDepth(root);
    //}
    //public int minTreeDepth(TreeNode node){
    //    if(node==null){
    //        return 0;
    //    }
    //    int leftDepth=minTreeDepth(node.left);
    //    int rightDepth=minTreeDepth(node.right);
    //    if(leftDepth==0){
    //        return rightDepth+1;
    //    }
    //    if(rightDepth==0){
    //        return leftDepth+1;
    //    }
    //    int min=0;
    //    min=Math.min(leftDepth,rightDepth)+1;
    //    return min;
    //}

    //广度优先算法
    //public int minDepth(TreeNode root) {
    //    Queue<TreeNode> queue=new LinkedList<>();
    //    int minDepth=0;
    //    if(root!=null){
    //        queue.add(root);
    //        while(!queue.isEmpty()){
    //            int count=queue.size();//记录这一层的节点数
    //            minDepth++;//遍历一层
    //            while(count>0){
    //                TreeNode tmp=queue.poll();
    //                if(tmp.left==null&&tmp.right==null){//如果是叶子结点
    //                    return minDepth;
    //                }
    //                if(tmp.left!=null) queue.add(tmp.left);
    //                if(tmp.right!=null) queue.add(tmp.right);
    //                count--;
    //            }
    //
    //        }
    //    }
    //    return minDepth;
    //}
}
