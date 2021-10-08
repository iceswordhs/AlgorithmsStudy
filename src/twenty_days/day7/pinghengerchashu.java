package twenty_days.day7;

/**
 * @author Hs
 * @Date 2021/10/8 22:08
 */

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 * 思路：递归判断左右子树的高度是否相差大于1，如果大于1就返回-1，否则返回较大值+1(即本节点为根节点的树的深度)
 */
public class pinghengerchashu {
    //public boolean isBalanced(TreeNode root) {
    //    if(maxDepth(root)==-1){
    //        return false;
    //    }
    //    return true;
    //}
    //public int maxDepth(TreeNode node){
    //    if(node==null){
    //        return 0;
    //    }
    //    int leftDepth=maxDepth(node.left);
    //    int rightDepth=maxDepth(node.right);
    //    if(leftDepth==-1||rightDepth==-1)
    //        return -1;
    //    if(Math.abs(leftDepth-rightDepth)<=1){
    //        return Math.max(leftDepth,rightDepth)+1;
    //    } else return -1;
    //}
}
