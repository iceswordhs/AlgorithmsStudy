package shieryue12.Dec_24;

/**
 * @author Hs
 * @Date 2021/12/24 21:12
 */

import java.util.*;

/**
 * 给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，
 * 找出所有同时在二维网格和字典中出现的单词。
 *
 * 单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
 *
 * 思路：前缀树+深度优先遍历+回溯
 */
public class leetcode_212 {
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public List<String> findWords(char[][] board, String[] words) {
        // 构建前缀树
        PrifixTree prifixTree=new PrifixTree();
        for(int i=0;i<words.length;i++){
            prifixTree.insert(words[i]);
        }
        Set<String> ans = new HashSet<String>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                dfs(board, prifixTree, i, j, ans);
            }
        }

        return new ArrayList<String>(ans);
    }
    public void dfs(char[][] board, PrifixTree now, int i1, int j1, Set<String> ans) {
        if (!now.children.containsKey(board[i1][j1])) {
            return;
        }
        char ch = board[i1][j1];
        now = now.children.get(ch);
        if (!"".equals(now.word)) {
            ans.add(now.word);
        }

        board[i1][j1] = '#';
        for (int[] dir : dirs) {
            int i2 = i1 + dir[0], j2 = j1 + dir[1];
            if (i2 >= 0 && i2 < board.length && j2 >= 0 && j2 < board[0].length) {
                dfs(board, now, i2, j2, ans);
            }
        }
        board[i1][j1] = ch;
    }
}
// 前缀树实现
class PrifixTree{
    String word;
    Map<Character,PrifixTree> children;
    boolean  isEnd;

    public PrifixTree(){
        this.word="";
        this.children=new HashMap<>();
    }

    public void insert(String word){
        PrifixTree cur = this;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(!cur.children.containsKey(c)){
                cur.children.put(c,new PrifixTree());
            }
            cur=cur.children.get(c);
        }
        cur.word=word;
        cur.isEnd=true;
    }
}
