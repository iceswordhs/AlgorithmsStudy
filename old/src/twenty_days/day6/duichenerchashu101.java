package twenty_days.day6;

/**
 * @author Hs
 * @Date 2021/10/7 22:04
 */

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 * 思路：p和q都指向根节点，但是当p左移时，q右移，比较是否相等
 */
public class duichenerchashu101 {
    //public boolean isSymmetric(TreeNode root) {
    //    return isequals(root,root);
    //}
    //public boolean isequals(TreeNode p,TreeNode q){
    //    if(p==null&&q==null){
    //        return true;
    //    }
    //    if(p==null||q==null){//此时若有一个变量为null，则必不相等，因为两者都为null的情况已经排除了，所以一个为null，另一个不可能为null，必然不相等
    //        return false;
    //    }
    //    return p.val==q.val&&isequals(p.left,q.right)&&isequals(p.right,q.left);
    //}
}
