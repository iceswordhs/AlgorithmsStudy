package twenty_days.day10;

/**
 * @author Hs
 * @Date 2021/10/11 17:20
 */

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 思路：深度优先遍历，这样可以方便的同时访问到两棵树的同一个位置
 */
public class hebingerchashu617 {
    //public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    //    if(root1==null) return root2;
    //    if(root2==null) return root1;
    //    TreeNode merges=new TreeNode();
    //    merges.val=root1.val+root2.val;
    //    if(root1!=null&&root2!=null)  {
    //        merges.left=mergeTrees(root1.left,root2.left);
    //        merges.right=mergeTrees(root1.right,root2.right);
    //    }
    //    return merges;
    //}
}
