package shiyiyue11.Nov_24;

/**
 * @author Hs
 * @Date 2021/11/24 22:03
 */

/**
 * 给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字。
 *
 * 思路：列出0-9的英文，发现z、w、u、x、g是某个数字特有的，可以直接得出对应数的个数
 *      然后通过已得到的数的个数，推断其他数的个数
 */
public class leetcode_423 {
    public String originalDigits(String s) {
        String[] strings=new String[]{"one","two","three","four","five"};
        int length=s.length();
        char[] chars=new char[26];
        // 使用s.toCharArray比charAt快
        for (char c : s.toCharArray()) {
            chars[c-'a']++;
        }
        int[] count=new int[10];
        count[0]=chars['z'-'a'];
        count[2]=chars['w'-'a'];
        count[4]=chars['u'-'a'];
        count[6]=chars['x'-'a'];
        count[8]=chars['g'-'a'];

        count[3]=chars['h'-'a']-count[8];
        count[5]=chars['f'-'a']-count[4];
        count[7]=chars['s'-'a']-count[6];

        count[1]=chars['o'-'a']-count[0]-count[2]-count[4];
        count[9]=chars['i'-'a']-count[5]-count[6]-count[8];

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10;i++){
            for(int j=0;j<count[i];j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
