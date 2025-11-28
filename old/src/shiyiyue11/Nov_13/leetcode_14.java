package shiyiyue11.Nov_13;

/**
 * @author Hs
 * @Date 2021/11/13 18:52
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 思路：横向扫描  遍历完第一个，然后遍历第二个，保存相同前缀，再遍历第3个
 *
 * 思路2：纵向扫描 遍历所有的第一个字母，如果相同，遍历所有字符串的第二个字母，依次类推
 */
public class leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        int slength=strs.length;
        if(slength==0) return "";
        int firstStringCharCount=strs[0].length();
        for(int i=0;i<firstStringCharCount;i++){//遍历第一个字符串的每个字符
            char c=strs[0].charAt(i);
            for(int j=1;j<slength;j++){// 遍历所有字符串，如果i等于字符串的长度，说明已经不可能有更长的了，返回
                if(strs[j].length()==i||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
