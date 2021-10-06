package swordoffer2;

public class solution55_II {
//    boolean result=true;
//    public boolean isBalanced(TreeNode root) {//自顶向下求深度，进行了很多重复计算,遍历了每一个节点，
                                                //计算每一个节点深度时都重新计算了一遍
//        if(root==null) return true;
//        dfs(root);
//        return result;
//    }
//    public void dfs(TreeNode node){
//        if(node==null){
//            return;
//        }
//        if(result==false){
//            return;
//        }
//        dfs(node.left);
//        if(Math.abs(depth(node.right)-depth(node.left))>1){
//            result=false;
//            return;
//        }
//        dfs(node.right);
//    }
//    public int depth(TreeNode node){//虽然也是自底向上求深度，但是求出的子节点深度没有利用上
//        if(node==null) return 0;
//        return Math.max(depth(node.left),depth(node.right))+1;
//    }

    public boolean isBalanced(TreeNode root) {//自底向上求深度 每计算出一个节点的深度都进行处理，
                                              // 并根据此节点的深度求父节点的深度
        return depth(root)!=-1;
    }
    public int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=depth(node.left);
        if(left==-1){
            return -1;
        }
        int right=depth(node.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;//求出子节点深度后先进行比较，
                                                                // 这样就不需要再判断子节点是否满足条件了
    }

}
