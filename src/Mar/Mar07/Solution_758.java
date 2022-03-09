package Mar.Mar07;

/**
 * @author Hs
 * @Date 2022/3/7 10:54
 */

import java.util.*;

/**
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 *
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 *
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 *
 * 字符串 target 代表可以解锁的数字，你需要给出解锁需要的最小旋转次数，如果无论如何不能解锁，返回 -1 。
 *
 *
 * 思路： 广度优先搜索
 *
 */
public class Solution_758 {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue=new LinkedList<>();
        int minSteps=0;
        queue.offer("0000");
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                String cur=queue.poll();
                size--;
                if(visited.contains(cur))
                    continue;
                visited.add(cur);
                if(cur.equals(target)) return minSteps;
                for(int i=0;i<4;i++){
                    String cur1=pushOne(cur,i);
                    if(!visited.contains(cur1)){
                        queue.offer(cur1);
                    }
                    String cur2=minusOne(cur,i);
                    if(!visited.contains(cur2)){
                        queue.offer(cur2);
                    }
                }
            }
            minSteps++;
        }
        return -1;
    }
    public String pushOne(String cur,int index){
        char[] chars=cur.toCharArray();
        if(chars[index]=='9') chars[index]='0';
        else chars[index]++;
        return new String(chars);
    }

    public String minusOne(String cur,int index){
        char[] chars=cur.toCharArray();
        if(chars[index]=='0') chars[index]='9';
        else chars[index]--;
        return new String(chars);
    }
}
