package swordoffer1;

public class solution66 {
    public int[] constructArr(int[] a) {
        if(a.length==0) return new int[]{};
        int[] b=new int[a.length];
        b[0]=1;
        for(int i=1;i<a.length;i++){
            b[i]=b[i-1]*a[i-1];//b[i]比b[i-1]多乘一个a[i-1]
        }
        int tmp=1;
        for(int i=a.length-2;i>=0;i--){
            tmp*=a[i+1];
            b[i]=b[i]*tmp;//从倒数第2个b[i]开始，b[i]乘上a[i+1]*...*a[a.length()-1]
        }
        return b;
    }
}
