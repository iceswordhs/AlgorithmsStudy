package swordoffer2;

public class solution58_I {
//    public String reverseWords(String s) {
//        Stack<String> words=new Stack<>();
//        char[] chars=s.toCharArray();
//        for(int i=0;i<(chars.length);i++){
//            if(chars[i]!=' '){
//                String t= "";
//                while(i<chars.length&&chars[i]!=' '){
//                    t=t+chars[i];
//                    i++;
//                }
//                words.push(t);
//            }
//        }
//        String result="";
//        while(!words.empty()){
//            result=result+words.pop()+" ";
//        }
//        if(!result.isEmpty()){
//            result=result.substring(0,result.lastIndexOf(" "));
//        }
//        return result;
//    }

    public String reverseWords(String s) {
        s=s.trim();
        int i=s.length()-1;
        int j=i;
        StringBuilder res=new StringBuilder();
        while(i>=0){
            while (i>=0&&s.charAt(i)!=' ')i--;
            res.append(s.substring(i+1,j+1)+" ");
            while (i>=0&&s.charAt(i)==' ')i--;
            j=i;
        }
        return res.toString().trim();
    }
}
