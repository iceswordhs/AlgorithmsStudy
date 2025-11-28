package twenty_days.day12;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Hs
 * @Date 2021/10/13 21:24
 */

/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 思路：深度优先遍历，遍历整个数组，如果其值等于word的第一个字符，深度优先搜索
 *      先将当前所在的地方置为'\0'，表示已经搜索过，
 *      然后深度优先搜索这个字符的4个方向，
 *      搜索结束后将当前所在的位置变回去
 *      返回结果
 */
public class juzhenzhongdelujing_offer_12 {
    class Solution {
        public boolean exist(char[][] board, String word) {
            char[] words = word.toCharArray();
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    if(dfs(board, words, i, j, 0)) return true;
                }
            }
            return false;
        }
        boolean dfs(char[][] board, char[] word, int i, int j, int k) {
            if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
            if(k == word.length - 1) return true;
            board[i][j] = '\0';
            boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                    dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
            board[i][j] = word[k];
            return res;
        }
    }
}
