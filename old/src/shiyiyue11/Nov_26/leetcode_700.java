package shiyiyue11.Nov_26;

import shiyiyue11.utils.TreeNode;

/**
 * @author Hs
 * @Date 2021/11/26 19:52
 */

/**
 *给定二叉搜索树（BST）的根节点和一个值。
 * 你需要在BST中找到节点值等于给定值的节点。
 * 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * 思路：深度优先遍历即可
 */
public class leetcode_700 {
    TreeNode result=null;
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root,val);
        return result;
    }
    public void dfs(TreeNode node, int val){
        if(node==null) return;
        if(result!=null) return;
        if(node.val==val) {
            result=node; return;
        }
        dfs(node.left, val);
        dfs(node.right, val);
    }
}
