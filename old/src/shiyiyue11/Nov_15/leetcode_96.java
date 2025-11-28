package shiyiyue11.Nov_15;

/**
 * @author Hs
 * @Date 2021/11/15 21:06
 */

/**
 * 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
 *
 * 思路：n个节点，由1,2,3,4...n组成的二叉搜索树
 *      因为是二叉搜索树，所以如果i为节点，左边子树必定由[1.i-1]组成，右边子树必定由[i+1，n]组成
 *      设G(n)为长度为n的二叉搜索树的个数，f(i,n)为以i为根节点，长度为n的二叉搜索树的个数 很明显G(n)= i=1...i=n f(i,n)之和
 *      而f(i,n)又等于 G(i-1)*G(n-i) （因为根节点不同所以树肯定不重复）
 *
 */
public class leetcode_96 {
    public int numTrees(int n) {
        int[] memory=new int[n+1];
        memory[0]=1;
        memory[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                memory[i]+=memory[j-1]*memory[i-j];// 因为要使用的memory元素下标最大为i-1，所以要使用的元素都已经计算过了
            }
        }
        return memory[n];
    }

}
