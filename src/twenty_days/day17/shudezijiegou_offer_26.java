package twenty_days.day17;

import swordoffer2.utils.TreeNode;

/**
 * @author Hs
 * @Date 2021/10/18 20:22
 */

/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 思路：深度优先遍历A， B不变
 *      当遇到A的val与B相等时，对两个点进行深度优先遍历
 *      注意：如果B子树中的节点为null，A对应节点可以为任意值
 *           但是如果B子树中的节点不为null，A对应节点为null是错误的
 */
public class shudezijiegou_offer_26 {
    boolean flag=false;
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        dfs(A,B);
        return flag;
    }
    public void dfs(TreeNode A,TreeNode B){
        if(A==null||B==null) return;// 这里保证了B如果是A的子结构，两者不会是空树
        if(A.val==B.val){// 如果相等，进行判断
            if(isEqual(A,B)) {
                flag=true;
                return;
            }
        }
        dfs(A.left,B);
        dfs(A.right,B);
    }
    public boolean isEqual(TreeNode A,TreeNode B){
        if(B==null) return true;// 如果B为null，则A所在的位置可以为任意值
        if(A==null) return false;// 如果B不为null，A为null 为假
        if(A.val!=B.val) return false;
        return isEqual(A.left,B.left)&&isEqual(A.right,B.right);
    }
}
