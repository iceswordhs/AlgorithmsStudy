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
 * 思路：递归，设定节点的上下值
 * 1.左子树的下限为本节点的下限，左子树的上限为本节点的值；
 * 2.右子树的上限为本节点的上限，右子树的下限为本节点的值；
 * 3.这样就保证了子树的所有节点都满足条件
 */
public class yanzengerchasousuoshu98 {
    //public boolean isValidBST(TreeNode root) {
    //    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    //}
    //
    //public boolean isValidBST(TreeNode root,double lower,double upper){
    //    if(root==null){
    //        return true;
    //    }
    //    if(root.val<=lower||root.val>=upper){
    //        return false;
    //    }
    //    return isValidBST(root.left,lower,root.val)&&isValidBST(root.right,root.val,upper);
    // 左子树的下限为本节点的下限，左子树的上限为本节点的值；
    // 右子树的上限为本节点的上限，右子树的下限为本节点的值；
    // 这样就保证了子树的所有节点都满足条件
    //}
}
