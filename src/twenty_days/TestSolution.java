package twenty_days;

import twenty_days.day8.feibonaqishulie_jianzhioffer10_I;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/10/14 17:35
 */
public class TestSolution {
    public static void main(String[] args) {

    }
    public int get(int n){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            ans=ans/10;
        }
        return ans;
    }
}
