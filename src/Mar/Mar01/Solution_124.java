package Mar.Mar01;

/**
 * @author Hs
 * @Date 2022/3/2 14:06
 */

import shiyiyue11.utils.TreeNode;

/**
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。
 * 同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
 *
 * 路径和 是路径中各节点值的总和。
 *
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 *
 * 思路：后序遍历即可
 */
public class Solution_124 {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return res;
    }
    public int traverse(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,traverse(root.left));
        int right=Math.max(0,traverse(root.right));
        res=Math.max(res,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
