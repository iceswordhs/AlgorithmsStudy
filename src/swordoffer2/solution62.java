package swordoffer2;

public class solution62 {
//    public int lastRemaining(int n, int m) {
//        return f(n, m);
//    }
//
//    private int f(int n, int m) {
//        if(n==1) return 0;
//        int x=f(n-1,m);
//        return (m+x)%n;
//    }

    public int lastRemaining(int n, int m) {
        if(n==1) return 0;
        int f=0;
        for(int i=2;i!=n+1;i++){
            f=(m+f)%i;
        }
        return f;
    }
}
