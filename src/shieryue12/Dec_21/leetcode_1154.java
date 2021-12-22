package shieryue12.Dec_21;

/**
 * @author Hs
 * @Date 2021/12/21 19:42
 */

/**
 * 给你一个字符串date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
 *
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 *
 * 思路：用一个数组记录每月的天数，使用substring取出date中的年月日，
 * 当year为400的倍数，或者year为4的倍数并且不为100的倍数时为闰年，这时就把2月的天数+1
 * 遍历当月之前的月份，加上这些月份的天数
 */
public class leetcode_1154 {
    public int dayOfYear(String date) {
        Integer year=Integer.parseInt(date.substring(0,4));
        Integer mouth=Integer.parseInt(date.substring(5,7));
        Integer day=Integer.parseInt(date.substring(8));

        int[] mouthdays={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%400==0||(year%4==0&&year%100!=0)){
            mouthdays[1]++;
        }
        int result=0;
        for(int i=0;i<mouth-1;i++){
            result+=mouthdays[i];
        }

        return result+day;
    }
}
