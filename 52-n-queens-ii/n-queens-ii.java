class Solution {
    public int totalNQueens(int n) {
        String[][] board = new String[n][n];
        return backtrack(board, n, 0);
    }
    public int backtrack(String[][] board, int n, int row) {
        if(row == n) return 1;
        int count = 0;
        for(int col = 0; col < n; col++) {
            if(valid(board, row, col, n)) {
                board[row][col] = "Q";
                backtrack(board, n, row + 1);
                count += backtrack(board, n, row + 1);
                board[row][col] = " ";
            }
        }
        return count;
    }
    public boolean valid(String[][] board, int row, int col, int n) {
        // vertically any q
        for(int i = row - 1; i >= 0; i--) if(board[i][col] == "Q") return false;
        // left diag any q
        for(int i = row - 1, j = col - 1; i >= 0 & j >= 0; i--, j--) if(board[i][j] == "Q") return false;
        //right diag any q
        for(int i = row - 1, j = col + 1; i >= 0 & j < n; i--, j++) if(board[i][j] == "Q") return false;
        return true;
    }
}