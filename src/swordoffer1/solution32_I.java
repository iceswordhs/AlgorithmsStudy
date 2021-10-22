package swordoffer1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Hs
 * @Date 2021/10/22 21:51
 */

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 * 思路：广度优先遍历
 */
public class solution32_I {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        int t=0;
        Deque<TreeNode> deque=new ArrayDeque<>();
        if (root!=null){
            deque.add(root);
            while(!deque.isEmpty()){
                int size=deque.size();
                while(size!=0){
                    TreeNode pollNode = deque.poll();
                    integers.add(pollNode.val);
                    if (pollNode.left!=null){
                        deque.add(pollNode.left);
                    }
                    if (pollNode.right!=null){
                        deque.add(pollNode.right);
                    }
                    size--;
                }
            }
        }
        int[] ints=new int[integers.size()];
        for (int i=0;i<integers.size();i++){
            ints[i]=integers.get(i);
        }
        return ints;
    }
}
