package swordoffer1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/10/26 17:16
 */

/**
 * 思路1：看作有n个空位，每个空位都需要填一个字符。所以使用一个函数backt
 *      rack(回溯)，从左到右对每一个空位进行填写，填写完之后，将字符对应的vis[]数组变为1，表示已使用
 *      然后调用本身进行下一个空位的填写backtrack(i+1)；
 *      1.填空位之前先判断字符是否使用过(对应数组vis[]是否为1)，
 *      因为有可能有相同的字符，所以要想办法保证不因为相同的字符出现重复
 *      所以，将字符排序，这样相同的字符就相邻了；
 *      2.并且判断前一个字符是否未使用且与当前字符相同。这样就能保证相同的字符从左到右依次使用，这样就能保证不会因为相同字符产生重复字符串
 *      当相同字符出现顺序不变时(如：a1，b，a2：出现a1 b a2后，就不会再出现a2 b a1了)
 *
 * 思路2：通过获取下一个最大排列函数，完成要求
 */
public class solution38 {
    /**
     * 思路1 按照n个空位填空法，先将字符数组排序以便保证后续相同字符排列顺序不变，用vis记录一个字符是否被使用
     */
    //List<String> strings;
    //boolean[] vis;
    //public String[] permutation(String s) {
    //    strings=new ArrayList<>();// 保存生成的字符串
    //    vis=new boolean[s.length()];// vis用来保存对应字符是否使用
    //    char[] chars=s.toCharArray();
    //    Arrays.sort(chars);
    //    StringBuilder sb=new StringBuilder();
    //    backtrack(0,chars,s.length(),sb);
    //    String[] result=new String[strings.size()];
    //    for(int i=0;i<strings.size();i++){
    //        result[i]=strings.get(i);
    //    }
    //    return result;
    //}
    //void backtrack(int nowsize,char[] chars,int n,StringBuilder perm){
    //    if (nowsize==n){
    //        strings.add(perm.toString());
    //        return;
    //    }
    //    for (int i=0;i<chars.length;i++){
    //        if (vis[i]||(i>0&&!vis[i-1]&&chars[i-1]==chars[i])){
    //            continue;
    //        }
    //        vis[i]=true;
    //        perm.append(chars[i]);
    //        backtrack(nowsize+1,chars,n,perm);
    //        // 回溯
    //        perm.deleteCharAt(nowsize);
    //        vis[i]=false;
    //    }
    //}

    /**
     * 思路2 下一个更大排列
     */
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        List<String> strings=new ArrayList<>();
        String[] result;
        do{
            strings.add(new String(chars));
        } while (backtrack(chars));
        result=new String[strings.size()];
        for(int i=0;i<strings.size();i++){
            result[i]=strings.get(i);
        }
        return result;
    }
    boolean backtrack(char[] chars){
        int i=chars.length-2;
        while(i>=0&&chars[i]>=chars[i+1]){
            i--;
        }
        if (i<0) return false;
        int t=chars.length-1;
        while(t>=i+1&&chars[t]<=chars[i]){
            t--;
        }
        swap(chars,i,t);
        reverse(chars,i+1);
        return true;
    }
    void swap(char[] chars,int i,int j){
        char tem=chars[i];
        chars[i]=chars[j];
        chars[j]=tem;
    }
    void reverse(char[] chars,int start){
        int end=chars.length-1;
        while(start<end){
            swap(chars,start,end);
            start++;
            end--;
        }
    }
}
