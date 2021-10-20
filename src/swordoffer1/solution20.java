package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/20 16:53
 */

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *
 * 数值（按顺序）可以分成以下几个部分：
 *
 * 若干空格
 * 一个 小数 或者 整数
 * （可选）一个 'e' 或 'E' ，后面跟着一个 整数
 * 若干空格
 * 小数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 下述格式之一：
 * 至少一位数字，后面跟着一个点 '.'
 * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 * 一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 至少一位数字
 * 部分数值列举如下：
 *
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"]
 * 部分非数值列举如下：
 *
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
 *
 * 思路：官方使用有限状态自动机来做，
 *      直接模拟，面向用例编程
 *
 */
public class solution20 {
    public boolean isNumber(String s) {
        boolean hasNumber=false;// 记录是否有数字
        boolean isInt=false;// 如果前面出现了e E，后面就只能出现整数
        boolean hasDecimal=false;// 记录是否出现了小数点，出现了1次后再出现就返回false，出现了之后必须有数字
        boolean hase=false;// e只能出现一次
        s=s.trim();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' ') { return false;}
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                if(hasNumber) return false;
                continue;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                hasNumber=true;
                continue;
            }
            if(s.charAt(i)=='e'||s.charAt(i)=='E'){
                if(hase) return false;
                if(hasNumber==false) return false;
                else {
                    hase=true;
                    hasNumber=false;
                    isInt=true;
                }
                continue;
            }
            if(s.charAt(i)=='.'){
                if(isInt) return false;
                if(hasDecimal){
                    return false;
                }else if((i+1)<s.length()&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'){
                    hasDecimal=true;
                }else if((i-1)>=0&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'){
                    hasDecimal=true;
                }else
                    return false;
                continue;
            }
            return false;
        }
        return hasNumber;
    }
}
