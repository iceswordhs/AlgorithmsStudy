package swordoffer2;

import java.util.ArrayList;
import java.util.List;

/*
常见的 DFS ： 先序遍历、中序遍历、后序遍历；
常见的 BFS ： 层序遍历（即按层遍历）。
    第一种方法：DFS 递归
              树的深度是左右子树深度较大值加1
    第二种方法：BFS 栈

 */
public class solution55_I {
//    public int maxDepth(TreeNode root) {
//        if(root==null) return 0;
//        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
//    }
    public int maxDepth(TreeNode root){//比第1种方法慢
        if(root==null) return 0;
        List<TreeNode> queue=new ArrayList<>();
        queue.add(root);
        List<TreeNode> tmp;
        int res=0;
        while(!queue.isEmpty()){
            tmp=new ArrayList<>();
            for(TreeNode treeNode:queue){
                if(treeNode.left!=null){
                    tmp.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    tmp.add(treeNode.right);
                }
            }
            queue=tmp;
            res++;
        }
        return res;
    }
}
