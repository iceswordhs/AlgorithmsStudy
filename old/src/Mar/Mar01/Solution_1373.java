package Mar.Mar01;

import shiyiyue11.utils.TreeNode;

/**
 * @author Hs
 * @Date 2022/3/1 16:23
 */

/**
 * 题目：
 * 给你一棵以root为根的二叉树，请你返回 任意二叉搜索子树的最大键值和。
 *
 * 二叉搜索树的定义如下：
 *
 * 任意节点的左子树中的键值都小于此节点的键值。
 * 任意节点的右子树中的键值都 大于此节点的键值。
 * 任意节点的左子树和右子树都是二叉搜索树。
 *
 * 思路：要判断一个树是否是BST，需要有它左子树的最大值，右子树的最小值。
 *      有了这些，就可以判断是否是BST，如果是，就可以得出键值和，这时又需要左子树的最小值和右子树的最大值
 *      因此，进行后序遍历。先得到左右子树的相关值，然后进行处理
 */
public class Solution_1373 {
    int maxSum=0;
    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }
    public int[] traverse(TreeNode root){
        if(root==null){
            return new int[]{
                    1,Integer.MAX_VALUE,Integer.MIN_VALUE,0
            };
        }
        int[] res=new int[4];
        int[] left=traverse(root.left);
        int[] right=traverse(root.right);
        if(left[0]==1&&right[0]==1&&root.val>left[2]&&root.val<right[1]){
            res[0]=1;
            // 计算以 root 为根的这棵 BST 的最小值  因为当只有一个节点时，left[1]=Integer.MAX_VALUE
            res[1] = Math.min(left[1], root.val);
            // 计算以 root 为根的这棵 BST 的最大值
            res[2] = Math.max(right[2], root.val);
            res[3]=left[3]+right[3]+root.val;
            maxSum=Math.max(maxSum,res[3]);
        }else{
            res[0]=0;
        }

        return res;
    }
}
