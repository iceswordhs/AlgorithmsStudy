package twenty_days;

import twenty_days.day13.quanpailie46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Hs
 * @Date 2021/10/9 20:03
 */
public class Main {
    //public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
    //    int n = scanner.nextInt();
    //    int t;
    //    HashMap<String, Integer> map = new HashMap<>();
    //    int[] ints = new int[10050];
    //    for (int i = 1; i <= n; i++) {
    //        t = scanner.nextInt();
    //        ints[t]++;
    //        if (map.get("first" + t) == null) {
    //            map.put("first" + t, i);
    //        } else {
    //            map.put("last" + t, i);
    //        }
    //    }
    //    int max=Integer.MIN_VALUE;
    //    for (int i=0;i<10050;i++){
    //        if(ints[i]>max){
    //            max=ints[i];
    //        }
    //    }
    //    int[] ints1 = new int[10000];
    //    int count=0;
    //    for(int i=0;i<10050;i++){
    //        if (ints[i]==max){
    //            ints1[count++]=i;
    //        }
    //    }
    //    int min=Integer.MAX_VALUE;
    //    int minIndex=0;
    //    int maxIndex=0;
    //    for(int i=0;i<count;i++){
    //        int length=map.get("last"+ints1[i])-map.get("first"+ints1[i]);
    //        if(min>length) {
    //            min=length;
    //            minIndex=map.get("first"+ints1[i]);
    //            maxIndex=map.get("last"+ints1[i]);
    //        }
    //    }
    //    System.out.println(minIndex+" "+maxIndex);
    //}

    public static void main(String[] args) {
        quanpailie46 solution = new quanpailie46();
        solution.permute(new int[]{1,2,3});
    }
}
