package swordoffer1;


import java.util.Arrays;

/**
 * @author Hs
 * @Date 2021/10/14 17:35
 */
public class TestSolution {
    public static void main(String[] args) {
        SortedQueue queue = new SortedQueue();
        queue.addInt(1);
        queue.addInt(9);
        queue.addInt(4);
        System.out.println(Arrays.toString(queue.arrayList.toArray()));
        System.out.println(queue.select(4));
        System.out.println(queue.arrayList.size());
    }
}
