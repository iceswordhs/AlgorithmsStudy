package shiyiyue11.Nov_18;

/**
 * @author Hs
 * @Date 2021/11/18 21:31
 */

import shiyiyue11.utils.TreeNode;

/**
 * 给定一个二叉树，计算 整个树 的坡度 。
 *
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。
 * 如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 *
 * 整个树 的坡度就是其所有节点的坡度之和。
 *
 * 思路：深度优先搜索 获取左右子树的值，然后计算差值（坡度），然后返回本身节点的值加上左右子树的值
 */
public class leetcode_563 {
    int sum=0;
    public int findTilt(TreeNode root) {
        int t=dfs(root);
        return sum;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        sum+=Math.abs(left-right);
        return left+right+root.val;
    }
}
