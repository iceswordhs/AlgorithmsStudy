package test;

/**
 * @author Hs
 * @Date 2022/3/4 17:28
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(problem("", "a"));
        System.out.println(problem("abc", "abbc"));
        System.out.println(problem("abc", "abcd"));

    }
    public static Character problem(String a,String b){
        if (a.length()==0) return b.charAt(0);
        if(a.equals(b.substring(1))) return b.charAt(0);
        for(int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)){
                return b.charAt(i);
            }
        }
        return b.charAt(b.length()-1);
    }
}
