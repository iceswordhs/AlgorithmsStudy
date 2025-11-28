package shieryue12.Dec_13;

/**
 * @author Hs
 * @Date 2021/12/13 22:15
 */

/**
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 思路：可以使用Java自带的api，Integer(xxx,2)将2进制转换成整数计算，但是当长度过长就会报错
 *
 * 思路2：使用遍历字符串方式
 */
public class offer2_002 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            carry = sum / 2;
            sb.append(sum % 2);
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
