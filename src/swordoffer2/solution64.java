package swordoffer2;

public class solution64 {
    int res=0;
    public int sumNums(int n) {
        boolean x=n>1&&sumNums(n-1)>0;
        res+=n;
        return res;
    }
}
