package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/21 17:44
 */

/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 思路：深度优先遍历，同时遍历左右子树，
 * 如果值相等：对左子树的左节点和右子树的右节点做为参数递归，左子树的右节点和右子树的左节点做为参数递归
 */
public class solution28 {
    boolean flag=true;
    public boolean isSymmetric(TreeNode root) {
        dfs(root,root);
        return flag;
    }
    public void dfs(TreeNode left,TreeNode right){
        if(left==null&&right==null) return;
        if(left==null||right==null){
            flag=false;
            return;
        }
        if(left.val!=right.val){
            flag=false;
            return;
        }else {
            dfs(left.left,right.right);
            dfs(left.right,right.left);
        }
    }
}
