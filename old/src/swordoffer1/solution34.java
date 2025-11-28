package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/24 20:41
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * 思路：深度优先遍历
 * 每经过一个节点先将他们加入到list中，
 * 如果此时路径上的节点值加起来等于target，就将此时的list复制添加到ret中
 * 然后对节点的左右节点递归
 * 然后将节点移除队列，进行回溯
 */
public class solution34 {
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return ret;
    }

    public void dfs(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        path.pollLast();
    }
}
