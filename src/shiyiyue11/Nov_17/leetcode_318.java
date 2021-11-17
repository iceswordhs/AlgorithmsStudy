package shiyiyue11.Nov_17;

/**
 * @author Hs
 * @Date 2021/11/17 20:26
 */

/**
 * 给定一个字符串数组words，找到length(word[i]) * length(word[j])的最大值，
 * 并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。
 *
 * 思路：由于数量级为10的3次方，我们可以考虑使用O(n^2)的复杂度解决问题
 *      一般而言，1秒能出结果的数量级为10^7~10^8,所以整体复杂度应该小于10^8
 *      由于共有26个小写字母，可以用数字的26个二进制位来存储某个字符是否出现过
 *      这样当两个字符串对应的数进行与运算时，如果结果为0则两个字符串无相同字符，这样就比较他们的长度相乘是否为最大值
 */
public class leetcode_318 {
    public int maxProduct(String[] words) {
        int[] x=new int[words.length];
        int max=0;
        // 遍历字符串数组并记录每个字符串字符是否出现，如果出现，对应数组元素 与 该字符减‘a'的结果 进行或操作
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                x[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((x[i]&x[j])==0){
                    int t=words[i].length()*words[j].length();
                    if(t>max) max=t;
                }
            }
        }
        return max;
    }
}
