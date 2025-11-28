package shiyiyue11.Nov_1;

/**
 * @author Hs
 * @Date 2021/11/1 22:10
 */

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 思路：对于dp[i][j]；来说，如果s[i]==s[j]，那么如果dp[i+1][j-1]是回文串，dp[i][j]就是回文串
 *
 * 		所以用dp[l] [r]表示以l，r为端点的字符串是否为回文串。
 *
 * 		如果s.charAt(l)==s.charAt(r)那么dp[l] [r]=dp[l+1] [r-1]，注意：当r-l+1<=2的时候，他肯定是一个回文串
 *
 *      注意：要先确定右边界，这样就可以使用递推公式dp[l] [r]=dp[l+1] [r-1]，否则计算dp[l] [r]时，dp[l+1] [r-1]可能还未计算
 *
 * 		即** 要先计算长度较短的字符串 **
 */
public class leetcode5 {
    // 解法1 动态规划
    //public String longestPalindrome(String s) {
    //    int length=s.length();
    //    if(length<2) return s;
    //    int max=0,maxleft=0,maxright=0;
    //    boolean[][] dp=new boolean[length][length];
    //    // 要先判断前面的字符串是否为回文字符串 这样才能使用递推公式 dp[i][j]=dp[i-1][j-1] 所以要先确定右边界
    //    for(int r=1;r<length;r++){
    //        for(int l=0;l<r;l++){
    //            if(s.charAt(l)==s.charAt(r)){
    //                if((r-l)<3){
    //                    dp[l][r]=true;
    //                }else{
    //                    dp[l][r]=dp[l+1][r-1];
    //                }
    //            }
    //            if(dp[l][r]&&max<(r-l+1)){
    //                maxleft=l;
    //                maxright=r;
    //                max=r-l+1;
    //            }
    //        }
    //    }
    //    return s.substring(maxleft,maxright+1);
    //}

    // 解法2 中心扩散
    public String longestPalindrome(String s) {
        int length=s.length();
        if(length<2) return s;
        int max=0,maxleft=0,maxright=0;
        for(int i=0;i<length;i++){
            int len1=expand(s,i,i);// 对应字符串长度为奇数
            int len2=expand(s,i,i+1);// 对应字符串长度为偶数
            if(len1>len2&&max<len1){
                maxleft=i-len1/2;
                maxright=i+len1/2;
                max=len1;
            }else if(len1<=len2&&max<len2){
                // 如果为偶数，那么i肯定是前一半的最后一个，因为中心点是i，i+1
                maxleft=i-(len2-1)/2;
                maxright=i+len2/2;
                max=len2;
            }
        }
        return s.substring(maxleft,maxright+1);
    }
    public int expand(String s,int left,int right){
        // 向左右扩展直到到达极限
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        // 之所以要减去2，是因为跳出循环时两端字符已经不相等了
        return right-left+1-2;
    }
}
