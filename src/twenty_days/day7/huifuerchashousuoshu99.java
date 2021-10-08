package twenty_days.day7;

/**
 * @author Hs
 * @Date 2021/10/8 20:50
 */

/**
 * 先中序遍历，使用栈来维护。
 * 先尝试向左走，当走到底，弹出第一个并尝试向右走，这时因为是最底层肯定没有右节点
 * 弹出第二个，如果有右节点将其放入栈中；
 * 弹出栈顶，这时要么是倒数第二层右节点要么是倒数第三层左节点，一直循环，直到根节点，然后遍历右子树
 * 直到完成中序遍历
 *
 */
public class huifuerchashousuoshu99 {
//    Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
//    TreeNode x = null, y = null, pred = null;
//
//        while (!stack.isEmpty() || root != null) {
//        while (root != null) {// 尝试向左走
//            stack.push(root);
//            root = root.left;
//        }
//        root = stack.pop();// 最左边的叶子节点  倒数第二层最左边的叶子结点
//        if (pred != null && root.val < pred.val) {// 说明root是一个被移动的节点
//            y = root;
//            if (x == null) {
//                x = pred;
//            } else {
//                break;
//            }
//        }
//        pred = root;
//        root = root.right;//尝试向右走
//    }
//
//    swap(x, y);
//}
//
//    public void swap(TreeNode x, TreeNode y) {
//        int tmp = x.val;
//        x.val = y.val;
//        y.val = tmp;
//    }
}
