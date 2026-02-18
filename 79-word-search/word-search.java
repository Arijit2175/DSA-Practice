class Solution {
    public boolean exist(char[][] board, String word) {
        int nr = board.length;
        int nc = board[0].length;
        for(int i = 0; i < nr; i++) {
            for(int j = 0; j < nc; j++) if(board[i][j] == word.charAt(0) && backtrack(board, word, i, j, 0)) return true; 
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word, int i, int j, int pos) {
        if(pos == word.length()) return true;
        int nr = board.length;
        int nc = board[0].length;
        if((i < 0 )|| (i >= nr) || (j < 0) || (j >= nc) || (board[i][j] != word.charAt(pos))) return false;
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean valid = backtrack(board, word, i, j - 1, pos + 1)
                || backtrack(board, word, i - 1, j, pos + 1)
                || backtrack(board, word, i, j + 1, pos + 1)
                || backtrack(board, word, i + 1, j, pos + 1);
        board[i][j] = temp;
        return valid;
    }
}