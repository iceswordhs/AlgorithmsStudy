package com.hs.leetcode.array.bineraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/4 22:19
 */
public class Questionkama58 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int[] prefixNum = new int[n];
        prefixNum[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixNum[i] = prefixNum[i-1] + nums[i];
        }
        scanner.nextLine();
        while(scanner.hasNextLine()){
            String[] numStrings = scanner.nextLine().split(" ");
            System.out.println(numStrings[0]);
            System.out.println(numStrings[1]);
            int[] calculate = new int[2];
            calculate[0] = Integer.valueOf(numStrings[0]);
            calculate[1] = Integer.valueOf(numStrings[1]);
            if(calculate[0] == 0) System.out.println(prefixNum[calculate[1]]);
            else
            System.out.println(prefixNum[calculate[1]] - prefixNum[calculate[0] - 1]);
            // 1 2 3 4 5
        }
    }
}
