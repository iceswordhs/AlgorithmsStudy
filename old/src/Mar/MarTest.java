package Mar;

import Mar.Mar07.Solution_46;
import Mar.Mar07.Solution_758;
import Mar.Mar07.Solution_77;
import Mar.Mar08.DoubleList;
import Mar.Mar08.LRUCache;
import Mar.Mar08.Node;
import Mar.Mar08.Solution_323;

import java.util.LinkedHashMap;

/**
 * @author Hs
 * @Date 2022/3/7 10:56
 */
public class MarTest {
    public static void main(String[] args) {
        //Solution_758 solution = new Solution_758();
        //solution.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"},"8888");

        //Solution_77 solution = new Solution_77();
        //solution.combine(4,2);

        //Solution_46 solution = new Solution_46();
        //solution.permute(new int[]{1,2,3,4});

        //LRUCache lruCache = new LRUCache(2);
        //
        //LinkedHashMap<Integer, Node> lru = new LinkedHashMap<>();

        Solution_323 solution = new Solution_323();
        solution.countComponents(5,new int[][]{{0,1},{1,2},{2,3},{3,4}});
    }
}
