package twenty_days.day5;

/**
 * @author Hs
 * @Date 2021/10/7 20:24
 */

/**
 *给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *思路：遍历string，当遇到空格时，将单词翻转
 */
public class fanzhuanzifuchuan557 {
    //public String reverseWords(String s) {
    //    int t=0;
    //    StringBuilder sb=new StringBuilder();
    //    for(int i=0;i<s.length();i++){
    //        if(s.charAt(i)==' '){
    //            String str=s.substring(t,i);
    //            StringBuilder tempstr = new StringBuilder();
    //            tempstr.append(str);
    //            tempstr.reverse();
    //            sb.append(tempstr).append(" ");
    //            t=i+1;
    //        }
    //    }
    //    String str=s.substring(t,s.length());//处理最后一个单词
    //    StringBuilder tempstr = new StringBuilder();
    //    tempstr.append(str);
    //    tempstr.reverse();
    //    sb.append(tempstr);
    //    return sb.toString();
    //}

    // 方法2 效率较高
    public String reverseWords(String s) {
        char[] chars=s.toCharArray();
        int t=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                reverseChars(chars,t,i-1);
                t=i+1;
            }
        }
        reverseChars(chars,t,chars.length-1);
        return new String(chars);
    }
    public void reverseChars(char[] chars,int left,int right){
        while(left<right){
            chars[left]^=chars[right]^(chars[right]=chars[left]);
            left++;
            right--;
        }
    }
}
