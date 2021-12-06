package shieryue12.Dec_07;

/**
 * @author Hs
 * @Date 2021/12/6 20:17
 */

/**
 * 句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
 *
 * 例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
 * 给你一个句子 s 和一个整数 k,请你将 s 截断,使截断后的句子仅含前 k 个单词。返回截断s后得到的句子。
 *
 */
public class leetcode_1816 {
    public String truncateSentence(String s, int k) {
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') index++;
            if(k==index) return s.substring(0,i);
        }
        return s;
    }
}
