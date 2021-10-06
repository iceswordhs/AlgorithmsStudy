package twenty_days.day3;

/**
 * @author Hs
 * @Date 2021/10/6 21:35
 */

/**
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 思路：递归，遍历判断子节点是否小于根节点，越往下值越小。
 */
public class yanzengerchasousuoshu98 {
    //public boolean isValidBST(TreeNode root) {
    //    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    //}
    //
    //public boolean isValidBST(TreeNode node, long lower, long upper) {
    //    if (node == null) {
    //        return true;
    //    }
    //    if (node.val <= lower || node.val >= upper) {
    //        return false;
    //    }
    //    return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    //}
}
