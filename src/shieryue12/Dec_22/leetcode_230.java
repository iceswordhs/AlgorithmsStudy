package shieryue12.Dec_22;

/**
 * @author Hs
 * @Date 2021/12/22 22:54
 */

import shiyiyue11.utils.TreeNode;

/**
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 *
 * 思路：利用二叉搜索树中序遍历是从大到小遍历元素的性质，中序遍历二叉树
 */
public class leetcode_230 {
    int res=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return res;
    }
    public void dfs(TreeNode root,int k){
        if(root==null) return;
        dfs(root.left,k);
        count++;
        if(count==k) res=root.val;
        dfs(root.right,k);
    }
}
