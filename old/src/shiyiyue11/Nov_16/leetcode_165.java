package shiyiyue11.Nov_16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/11/16 19:57
 */

/**
 * 给你两个版本号 version1 和 version2 ，请你比较它们。
 *
 * 版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。
 * 每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。
 * 修订号从左到右编号，下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，
 * 以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
 *
 * 比较版本号时，请按从左到右的顺序依次比较它们的修订号。
 * 比较修订号时，只需比较 忽略任何前导零后的整数值 。
 * 也就是说，修订号 1 和修订号 001 相等 。如果版本号没有指定某个下标处的修订号，
 * 则该修订号视为 0 。例如，版本 1.0 小于版本 1.1 ，
 * 因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别为 0 和 1 ，0 < 1 。
 *
 * 返回规则如下：
 *
 * 如果version1>version2返回1，
 * 如果version1<version2 返回 -1，
 * 除此之外返回 0。
 *
 * 思路：用t1，t2分别记录遍历两个字符串的位置
 *      用x1，x2记录一个修订号的大小
 *      注意细节：
 *      1.前置0无效，但是后置0是有效的  10大于1  所以 x1+=x1*10+charAt(i)
 *      2.遍历字符串的时候，遇到数字就加到x1上，遇到 . 跳出，但是也要后移一位！！！
 *
 */
public class leetcode_165 {
    public int compareVersion(String version1, String version2) {
        int length1=version1.length();
        int length2=version2.length();
        int t1=0,t2=0;
        int x1=0,x2=0;
        int index1=0,index2=0;
        while(t1<length1&&t2<length2){
            while(t1<length1&&version1.charAt(t1)<='9'&&version1.charAt(t1)>='0'){
                x1+=x1*10+version1.charAt(t1)-'0';
                t1++;
            }
            t1++;// 遇到 . 跳出了也要++，否则永远走不完
            index1++;
            while(t2<length2&&version2.charAt(t2)<='9'&&version2.charAt(t2)>='0'){
                x2+=x2*10+version2.charAt(t2)-'0';
                t2++;
            }
            t2++;
            index2++;
            if(x1>x2) return 1;
            else if(x1<x2) return -1;
            x1=0;
            x2=0;
        }
        int x=0;
        if(t1!=length1){
            for(int i=t1;i<length1;i++){
                if(version1.charAt(i)!='0'&&version1.charAt(i)!='.'){
                    return 1;
                }
            }
        }
        if(t2!=length2){
            for(int i=t2;i<length2;i++){
                if(version2.charAt(i)!='0'&&version2.charAt(i)!='.'){
                    return -1;
                }
            }
        }
        return 0;
    }
}
