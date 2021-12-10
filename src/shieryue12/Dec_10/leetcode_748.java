package shieryue12.Dec_10;

/**
 * @author Hs
 * @Date 2021/12/10 20:07
 */

import java.util.Arrays;

/**
 *给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
 *
 * 补全词 是一个包含 licensePlate 中所有的字母的单词。在所有补全词中，最短的那个就是 最短补全词 。
 *
 * 在匹配 licensePlate 中的字母时：
 *
 * 忽略licensePlate 中的 数字和空格 。
 * 不区分大小写。
 * 如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
 * 例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
 *
 * 请你找出并返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 最靠前的 那个。
 *
 * 其中words中的单词都是小写
 *
 * 思路：遍历licensePlate，用一个数组记录每个单词出现的次数及总单词数
 *      遍历words，当单词总数为0时，如果当前字符串长度小于result，让result等于当前字符串
 */
public class leetcode_748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] chars=new int[26];
        int all=0;
        for(char c:licensePlate.toCharArray()){
            if(c>='a'&&c<='z'){
                chars[c-'a']++;
                all++;
            }
            if(c>='A'&&c<='Z'){
                chars[c-'A']++;
                all++;
            }
        }

        String result=null;
        for(String s:words){
            int[] tchars= Arrays.copyOf(chars,26);
            int _all=all;
            for(char c:s.toCharArray()){
                if(tchars[c-'a']-->0){
                    if(--_all==0&&(result==null||result.length()>s.length())){
                        result=s;
                    }
                    continue;
                }
            }
        }
        return result;
    }
}
