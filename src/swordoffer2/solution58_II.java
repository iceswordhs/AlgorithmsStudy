package swordoffer2;

public class solution58_II {
    public String reverseLeftWords(String s, int n) {
        String res=s.substring(0,n);
        s=s.substring(n);
        s=s+res;
        return s;
    }
}
