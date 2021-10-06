package swordoffer1;

public class solution5 {
    public String replaceSpace(String s) {
        if(s.equals("")) return "";
        StringBuilder builder=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                builder.append(s.charAt(i));
            }else {
                builder.append("%20");
            }
            i++;
        }
        return builder.toString();
    }
}
