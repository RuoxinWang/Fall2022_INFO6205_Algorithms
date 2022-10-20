package com.company;

import java.util.HashSet;

public class WordSearch {
    static boolean[][] location;
    public boolean exist(char[][] board, String word) {
        location = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean helper(char[][] board, int i, int j, int index, String word){
        if(index == word.length()) return true;
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(index) || location[i][j]) return false;
        location[i][j] = true;
        if(helper(board, i - 1, j, index + 1, word)
            || helper(board, i + 1, j, index + 1, word)
            || helper(board, i, j - 1, index + 1, word)
            || helper(board, i, j + 1, index + 1, word)){
            return true;
        }
        location[i][j] = false;
        return false;
    }
}
