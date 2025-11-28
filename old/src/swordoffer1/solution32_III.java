package swordoffer1;

import java.util.*;

/**
 * @author Hs
 * @Date 2021/10/23 10:59
 */

/**
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 * 思路：用List存储每行的值，奇数行将值添加到这一行list的尾端，偶数行将这一行的值添加到这一行list的头部
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *    第一行 3
 *    第二行 9添加到头部，{9} 20也添加到头部 {20,9} 完成了遍历
 *    第三行 15添加到尾部{15}，7添加到尾部{15,7}
 */
public class solution32_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> lists=new ArrayList<>();
        boolean leftToRight=true;
        if (root!=null) deque.add(root);
        while (!deque.isEmpty()){
            LinkedList<Integer> list=new LinkedList<>();
            int size=deque.size();
            while (size!=0){
                TreeNode poll = deque.poll();// 先进先出
                if (leftToRight) {
                    list.add(poll.val);// 奇数行添加到尾端
                }else {
                    list.addFirst(poll.val);// 偶数行添加到头部
                }
                if (poll.left!=null) deque.add(poll.left);
                if (poll.right!=null) deque.add(poll.right);
                size--;
            }
            if (leftToRight) leftToRight=false;
            else leftToRight=true;
            lists.add(list);
        }
        return lists;
    }
}
