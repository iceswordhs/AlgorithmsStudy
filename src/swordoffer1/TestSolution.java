package swordoffer1;


import java.util.Arrays;

/**
 * @author Hs
 * @Date 2021/10/14 17:35
 */
public class TestSolution {
    public static void main(String[] args) {
        solution29 solution=new solution29();
        int[] ints = solution.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(Arrays.toString(ints));
    }
}
