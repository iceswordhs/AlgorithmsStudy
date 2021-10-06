package swordoffer2;


public class solution60 {
    public double[] dicesProbability(int n) {
        double[][] dp=new double[12][70];
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=i;j<=6*i;j++){//i个骰子共可能出现多少种结果
                for(int cur=1;cur<=6;cur++){
                    if((j-cur)<=0) break;//当总结果小于此次骰子结果时，跳过
                    dp[i][j]=dp[i][j]+dp[i-1][j-cur];
                }
            }
        }
        int all=(int)Math.pow(6,n);
        double[] res=new double[n*5+1];
        for(int i=n,j=0;i<=n*6;i++,j++){
            res[j]=dp[n][i]*1.0/all;
        }
        return res;
    }
}
