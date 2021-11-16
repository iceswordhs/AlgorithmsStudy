package shiyiyue11;

import shiyiyue11.Nov_16.leetcode_165;

import java.util.Arrays;

/**
 * @author Hs
 * @Date 2021/11/4 20:27
 */
public class TestMianshi {
    public static void main(String[] args) {
        int[][] dp=new int[3][4];
        int t=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=t++;
            }
        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));
    }
}
