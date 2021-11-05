package shiyiyue11.Nov_5;

/**
 * @author Hs
 * @Date 2021/11/5 17:23
 */

/**
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
 * -2的31次方 <= a, b <= 2的31次方 - 1
 * b != 0
 *
 * 思路：因为a有可能为-2147483648，所以如果将a，b都转换为正数计算有可能溢出，所以将他们都转换为负数计算
 *      如果a为-2147483648且b为-1，就返回Integer.MAX_VALUE
 */
public class offer_zhuanxiang_01 {
    public int divide(int a, int b) {
        int MIN=Integer.MIN_VALUE;
        int MAX=Integer.MAX_VALUE;
        if(a==MIN&&b==-1) return MAX;
        Boolean flag=false;
        if((a<0&&b<0)||(a>=0&&b>=0)){
            flag=true;
        }
        a=a>0?-a:a;//将他们全变成负的，这样就防止了 负2的31次方变成正数溢出
        b=b>0?-b:b;
        int result=0;
        while(a<=b){
            int temp=b;
            int num=1;
            while(temp>=a-temp){
                temp=temp+temp;
                num=num+num;
            }
            a-=temp;
            result+=num;
        }
        if(flag){
            return result;
        }
        return -result;
    }
}