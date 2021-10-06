package twenty_days.day4;

/**
 * @author Hs
 * @Date 2021/10/6 20:47
 */

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 * 思路：先遍历左节点，然后将中间结点添加到List中，再遍历右节点。当节点为null时返回
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class erchashudezongxubianli94 {
    //public List<Integer> inorderTraversal(TreeNode root) {
    //    List<Integer> integers=new ArrayList<>();
    //    inorder(root,integers);
    //    return integers;
    //}
    //public void inorder(TreeNode node,List<Integer> integers){
    //    if(node==null){
    //        return;
    //    }
    //    inorder(node.left,integers);//遍历左子树
    //    integers.add(node.val);//将中间结点的值添加到数组
    //    inorder(node.right,integers);//遍历右子树
    //}
}
