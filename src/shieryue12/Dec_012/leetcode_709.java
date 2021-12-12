package shieryue12.Dec_012;

/**
 * @author Hs
 * @Date 2021/12/12 18:17
 */

/**
 * 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串
 *
 * 思路：直接使用api或者强制转换
 */
public class leetcode_709 {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z'){
                c=(char)(c+('a'-'A'));
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
