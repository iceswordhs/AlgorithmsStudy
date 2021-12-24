package shieryue12.Dec_24;

/**
 * @author Hs
 * @Date 2021/12/24 17:25
 */

import shiyiyue11.utils.TreeNode;

/**
 * 给定一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 *
 * 每条从根节点到叶节点的路径都代表一个数字：
 *
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 *
 * 叶节点 是指没有子节点的节点。
 *
 * 思路：深度优先遍历 注意，只有一个节点的左右节点都为null，他才是一个叶节点，才可以将这条路径上的和加到结果上
 */
public class offer2_049 {
    int allsum=0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return allsum;
    }
    public void dfs(TreeNode node,int sum){
        sum=sum*10;
        sum+=node.val;
        if(node.left!=null){
            dfs(node.left,sum);
        }
        if(node.right!=null){
            dfs(node.right,sum);
        }
        if(node.left==null&&node.right==null){
            allsum+=sum;
        }

    }
}
