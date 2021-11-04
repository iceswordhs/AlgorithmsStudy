package shiyiyue11.Nov_4;

/**
 * @author Hs
 * @Date 2021/11/4 20:08
 */

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 思路：使用substring方法截取0到length
 *      使用replace方法将" "替换为"%20"
 */
public class mianshi_03 {
    public String replaceSpaces(String S, int length) {
        S=S.substring(0,length);
        S=S.replace(" ","%20");
        return S;
    }
}
