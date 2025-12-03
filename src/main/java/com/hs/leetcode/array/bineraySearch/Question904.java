package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/2 17:47
 */
public class Question904 {
//    public static int totalFruit(int[] fruits) {
//        int maxNum = -1;
//        int i = 0;
//        int[] classs = new int[2];
//        classs[0]=-1;
//        classs[1] = -1;
//        for(int j=0; j<fruits.length;j++){
//            // 遇到了一个新的种类
//            if(fruits[j] != classs[0] && fruits[j] != classs[1] && classs[0] != -1 && classs[1] != -1) {
//                // 记录要保留的种类
//                int t = fruits[j-1];
//                if(classs[0] == t){
//                    classs[1] = fruits[j];
//                }else{
//                    classs[0] = fruits[j];
//                }
//                i = j-1;
//                while(i>=0 && fruits[i]==t){
//                    i--;
//                }
//                i++;
//            }else if(fruits[j] != classs[0] && fruits[j] != classs[1] && classs[0] == -1){
//                classs[0] = fruits[j];
//                i=Math.min(i,j);
//                int length = j-i+1;
//                maxNum = Math.max(length,maxNum);
//            }else if(fruits[j] != classs[0] && fruits[j] != classs[1] && classs[1] == -1){
//                classs[1] = fruits[j];
//                i=Math.min(i,j);
//                int length = j-i+1;
//                maxNum = Math.max(length,maxNum);
//            }else if(fruits[j] == classs[0] || fruits[j] == classs[1]){
//                int length = j-i+1;
//                maxNum = Math.max(length,maxNum);
//            }
//        }
//        return maxNum;
//    }

    /**
     * 思路：
     *
     * 滑动窗口，只是窗口左下标移动较复杂
     *
     * 使用map存储窗口中水果种类以及对应的个数，当窗口中水果种类大于2，也就是map.size大于2时，需要移动左指针，
     * 当水果种类对应的个数为0时，从map移除这个种类，让map.size回到2
     */
    public static int totalFruit(int[] fruits) {
        int maxNum = -1;
        int leftPoint = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int j=0; j<fruits.length;j++){
            // 遇到了一个新的种类
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2 && leftPoint<=j){
                int leftClass = fruits[leftPoint];
                leftPoint++;
                map.put(leftClass,map.get(leftClass)-1);
                if(map.get(leftClass) == 0)
                    map.remove(leftClass);
            }
            int length = j-leftPoint+1;
            maxNum = Math.max(length,maxNum);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{0, 1, 2, 2, 3}));
    }
}
