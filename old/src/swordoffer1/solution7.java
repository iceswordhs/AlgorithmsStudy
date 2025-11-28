package swordoffer1;

import java.util.HashMap;

public class solution7 {
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] pre;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=preorder;
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return BulidingTree(0,0,inorder.length-1);
    }

    private TreeNode BulidingTree(int rootIndex, int left, int right) {//rootIndex是根节点在前序遍历中的位置
                                                                       //left，right是树在中序遍历中的左右边界
        if(left>right) return null;//当到叶子节点时，退出 //当到达叶子节点时，index-1=-1
        TreeNode node=new TreeNode(pre[rootIndex]);
        int index=map.get(pre[rootIndex]);//根据根节点在中序遍历数组中的位置得到左右子树的大小 左子树长度left，index-1
                                            // 根据左右子树的大小判断出左右子树在先序遍历中的位置
        node.left=BulidingTree(rootIndex+1,left,index-1);//当到达叶子节点时，index-1=-1
        node.right=BulidingTree(rootIndex+index-left+1,index+1,right);//右子树长度为index-left，所以在前序遍历中
                                                                        //右子树的最后一个节点为rootIndex+index-left
                                                                        //所以左子树的根节点为rootIndex+index-left+1
        return node;
    }
}
