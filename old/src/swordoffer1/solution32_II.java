package swordoffer1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/10/23 10:30
 */

/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，
 * 每一层打印到一行。
 *
 * 思路：广度优先遍历，每遍历一层就将这一层节点的值放到一个List中，每层的List存放到一个Lise<List<>>中
 */
public class solution32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque=new ArrayDeque<>();
        List<List<Integer>> lists=new ArrayList<>();
        if(root!=null){
            deque.add(root);
        }
        while(!deque.isEmpty()){
            int size=deque.size();
            List<Integer> list=new ArrayList<>();
            while(size!=0){
                TreeNode node=deque.poll();
                list.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
                size--;
            }
            lists.add(list);
        }
        return lists;
    }
}
