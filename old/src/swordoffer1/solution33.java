package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/23 16:06
 */

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 * 思路：根据二叉搜索树的性质，后序遍历数组中第一个大于最后一个值(也就是根节点)的值就是右子树的起点，记这个起点的值为m
 *      根据这个性质分出左子树所在位置，i，m-1
 *      右子树所在位置 m，j-1
 *      根节点为j
 *      左子树中的值必须都小于j，右子树中的值必须都大于j，根据这个性质判断；
 *      如果满足，判断左右子树是否满足
 *      如果左右子树的边界，i>=j，代表左右子树不存在或者只有一个，直接返回true
 *
 */
public class solution33 {
    public boolean verifyPostorder(int[] postorder) {
        return check(postorder,0,postorder.length-1);
    }
    public boolean check(int[] postorder,int i,int j){
        if(i>=j) return true;// 当i==j，表示只有一个节点；当i>j表示没有左子树/右子树，是空的
        int p=i;
        while(postorder[p]<postorder[j]){// postorder[j]是根节点，找到第一个大于根节点的值，也就是右子树的起点
            p++;
        }
        int m=p;// 得到右子树的起点
        while(postorder[p]>postorder[j]){// 判断右子树是否都大于根节点
            p++;
        }
        return p==j&&check(postorder,i,m-1)&&check(postorder,m,j-1);
    }
}
