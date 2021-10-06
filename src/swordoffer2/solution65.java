package swordoffer2;

/*
    a，b两数相加可转化为a^b+(a&b)<<1
 */
public class solution65 {
    public int add(int a, int b) {
        while (b!=0){
            int c=(a&b)<<1; //c为1的位数不会增加，只会减少，
                            // 因为&操作只有都为1的情况下才会为1，c为0的位数永远不会为1
                            // 所以进位终究会为0
            a=a^b;
            b=c;
        }
        return a;
    }
}
