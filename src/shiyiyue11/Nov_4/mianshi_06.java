package shiyiyue11.Nov_4;

/**
 * @author Hs
 * @Date 2021/11/4 20:24
 */

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，
 * 则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 思路：将S转换为char数组，然后遍历，用t=1记录相同字符的个数，
 *      如果chars[i]==chars[i+1]且i+1<length，就i++，t++
 *      然后将char[i]和t放入StringBuilder
 */
public class mianshi_06 {
    public String compressString(String S) {
        StringBuilder sb=new StringBuilder();
        char[] chars=S.toCharArray();
        int length=chars.length;
        int t=0;
        for(int i=0;i<length;i++){
            t=1;
            while((i+1)<length&&chars[i]==chars[i+1]){
                i++;
                t++;
            }
            sb.append(chars[i]);
            sb.append(t);
        }
        String newstr=sb.toString();
        if(newstr.length()>=S.length()){
            return S;
        }
        return newstr;
    }
}
