package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/19 19:31
 */

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 思路：深度遍历每个节点，交换每个节点的左右子节点
 */
public class solution27 {
    TreeNode t=new TreeNode(0);
    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        t=root.left;
        root.left=root.right;
        root.right=t;
        dfs(root.left);
        dfs(root.right);
    }
}
