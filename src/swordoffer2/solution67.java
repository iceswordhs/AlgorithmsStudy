package swordoffer2;

public class solution67 {
    public int strToInt(String str) {
//        str=str.trim();//使用trim()较慢
        char[] chars=str.toCharArray();
        if(chars.length==0) return 0;
        int x=0;
        while(chars[x]==' '){
            x++;
            if(x==chars.length) return 0;
        }
        int sign=1;
        if(chars[x]=='-'){
            sign=-1;
            x++;
        }else if(chars[x]=='+'){
            x++;
        }
        int res=0;
        int bndry=Integer.MAX_VALUE/10;
        for(int i=x;i<chars.length;i++){
            if(chars[i]<'0'||chars[i]>'9') break;
            //这里chars[i]>'7'返回是因为-2147483648,无论chars[i]==8还是chars[i]>8
            //都是需要返回Integer.MIN_VALUE或Integer.MAX_VALUE,无法直接将2147483648赋给int型变量
            if(res>bndry||res==bndry&&chars[i]>'7') return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            res=res*10+(chars[i]-'0');
        }
        return sign*res;
    }
}
