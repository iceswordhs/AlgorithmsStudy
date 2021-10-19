package swordoffer1;
/*
    给定一棵二叉搜索树，请找出其中第k大的节点。
    知识点：对于二叉搜索树，中序遍历为从小到大排列，求第k大，即求从大到小排第k个，中序遍历倒叙即为从大到小
            也就是dfs(i.right);i.val;dfs(i.left);
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class solution54 {
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode i){
        if(i==null){
            return;
        }
        dfs(i.right);
        if(k==0) return;
        if(--k==0) res=i.val;
        dfs(i.left);
    }
}
