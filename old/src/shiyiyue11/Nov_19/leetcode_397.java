package shiyiyue11.Nov_19;

import java.util.HashMap;

/**
 * @author Hs
 * @Date 2021/11/19 21:33
 */

/**
 * 给定一个正整数n ，你可以做如下操作：
 *
 * 如果n是偶数，则用n / 2替换n 。
 * 如果n是奇数，则可以用n + 1或n - 1替换n 。
 * n变为 1 所需的最小替换次数是多少？
 *
 * 思路：dfs 加 记忆化
 */
public class leetcode_397 {
    HashMap<Integer, Integer> map;
    public int integerReplacement(int n) {
        map = new HashMap<>();
        return dfs(n);
    }
    public int dfs(int n){
        if(n == 1){
            return 0;
        }
        if(map.containsKey(n)) return map.get(n);

        int sum = 0;
        if(n % 2 == 0){
            sum += dfs(n / 2) + 1;
        }else{
            if(n != Integer.MAX_VALUE){
                sum += Math.min(dfs(n - 1), dfs(n + 1)) + 1;
            }else{
                sum += dfs(n - 1);
            }
        }
        map.put(n, sum);
        return sum;
    }
}
