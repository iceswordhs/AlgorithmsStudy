package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 16:30
 */

import shiyiyue11.utils.TreeNode;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 * 思路：最大直径就是某个节点的左右子树深度相加  由于用到了子树的值，所以使用后序遍历
 */
public class Solution_543 {
    int maxDepth=0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return maxDepth;
    }
    int traverse(TreeNode root){
        if(root==null) return 0;
        int left=traverse(root.left);
        int right=traverse(root.right);
        maxDepth=Math.max(maxDepth,left+right);
        return Math.max(left,right)+1;
    }
}
