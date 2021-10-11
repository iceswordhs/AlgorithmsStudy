package twenty_days.day10;

/**
 * @author Hs
 * @Date 2021/10/11 21:26
 */

/**
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 *
 * 思路：广度优先搜索，如果这一层中右侧还有节点，就将右指针指向节点
 */
public class tiancongjiedianyouzhizhen116 {
    //public Node connect(Node root) {
    //    Queue<Node> queue=new LinkedList<>();
    //    if(root!=null){
    //        queue.add(root);
    //        while(!queue.isEmpty()){
    //            int count=queue.size();
    //            while(count>0){
    //                Node tmp=queue.poll();
    //                if(count==1){
    //                    tmp.next=null;
    //                } else {
    //                    Node tmp2=queue.peek();
    //                    tmp.next=tmp2;
    //                }
    //                if(tmp.left!=null) queue.add(tmp.left);
    //                if(tmp.right!=null) queue.add(tmp.right);
    //                count--;
    //            }
    //        }
    //    }
    //    return root;
    //}
}
