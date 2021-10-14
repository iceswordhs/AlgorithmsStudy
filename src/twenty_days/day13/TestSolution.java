package twenty_days.day13;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hs
 * @Date 2021/10/14 17:35
 */
public class TestSolution {
    public static void main(String[] args) {
        quanpailie46 quanpailie46 = new quanpailie46();
        List<List<Integer>> permute = quanpailie46.permute(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(permute.toArray()));
    }
}
