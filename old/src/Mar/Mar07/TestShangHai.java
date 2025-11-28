package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/5 20:59
 */

/**
 * 上海银行笔试题
 * 给你6个人，判断是否有可能将这6个人分成两份，如果可以返回true，如果不行返回false
 *
 * 思路1：动态规划 初始状态为：一半的重量为0，无论是前几个人都是true
 *               状态转移方程为 dp[i][j]=dp[i-weights[j-1]][j-1];
 *
 * 思路2：深度优先遍历 一个人只有两种情况，要么选要么不选 是一个二叉树 判断一下路径上选了3个人并且重量为half的情况是否存在
 */
public class TestShangHai {
    private static boolean flag;
    public static void main(String[] args) {
        System.out.println(shagnhai(new Integer[]{1, 2, 2, 3, 4, 6}));
    }
    public static boolean shagnhai(Integer[] weights){
        int sum=0;
        int half=0;
        for (int w:weights){
            sum+=w;
        }
        if (sum%2!=0) return false;
        half=sum/2;
        //// 变化量1是sum，变化量2是第几个人了  dp[i][j]=true 就代表重量为i，前j个人时几个人等于这个重量  如果不能等于这个重量就为0
        //int[][] dp=new int[half+1][7];
        //for (int i=0;i<6;i++){
        //    dp[0][i]=0;
        //}
        //// 初始状态为dp[0][0]=true 当重量为0的时候，任意个人都可以满足要求
        //for(int i=0;i<=half;i++){
        //    int count=0;
        //    for (int j=1;j<=6;j++){
        //        if (i>=weights[j-1]){
        //            dp[i][j]=dp[i-weights[j-1]][j-1]+1;
        //        }
        //        if (dp[i][j]==3) return true;
        //    }
        //}
        //return dp[half][6]==0;

        // 思路2
        dfs(0,half,weights,0);
        return flag;
    }

    public static void dfs(Integer select,Integer half,Integer[] weights,Integer index){
        if (index==6){
            if (select==3&&half==0) flag=true;
            return;
        }
        // 二叉树直接写两个dfs就可以了  如果是多叉树就需要加上循环和回溯
        dfs(select+1,half-weights[index],weights,index+1);
        dfs(select,half,weights,index+1);
    }
}
