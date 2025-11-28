package twenty_days.day5;

/**
 * @author Hs
 * @Date 2021/10/7 20:17
 */

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 思路：两个指针分别指向首尾，然后交换，然后首尾都往中间移一位
 */
public class fanzhuanzhifuchuan344 {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char c=s[left];
            s[left]=s[right];
            s[right]=c;
            left++;
            right--;
        }
    }
}
