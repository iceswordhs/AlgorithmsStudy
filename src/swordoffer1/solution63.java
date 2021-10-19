package swordoffer1;

public class solution63 {
    public int maxProfit(int[] prices) {
        int max=0;//曾经有过的最大利润
        int t=0;//当前利润
        for(int i=1;i<prices.length;i++){
            t=t+prices[i]-prices[i-1];//加上今天产生的利润
            if(t<0) t=0;
            if(max<t) max=t;
        }
        return max;
    }
}
