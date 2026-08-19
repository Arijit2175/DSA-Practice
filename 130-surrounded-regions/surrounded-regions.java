class Solution {
    public void solve(char[][] board) {
        int nr = board.length;
        int nc = board[0].length;
        for (int col = 0; col < nc; col++) if (board[0][col] == 'O') dfs(board, 0, col, nr, nc);
        for (int col = 0; col < nc; col++) if (board[nr - 1][col] == 'O') dfs(board, nr - 1, col, nr, nc);
        for (int row = 0; row < nr; row++) if (board[row][0] == 'O') dfs(board, row, 0, nr, nc);
        for (int row = 0; row < nr; row++) if (board[row][nc - 1] == 'O') dfs(board, row, nc - 1, nr, nc);
        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                if (board[row][col] == 'V') board[row][col] = 'O';
                else if (board[row][col] == 'O') board[row][col] = 'X';
            }
        }
    }

    public void dfs(char[][] board, int row, int col, int nr, int nc) {
        if (row < 0 || row >= nr || col < 0 || col >= nc || board[row][col] != 'O') return;
        board[row][col] = 'V';
        dfs(board, row, col - 1, nr, nc);
        dfs(board, row, col + 1, nr, nc);
        dfs(board, row - 1, col, nr, nc);
        dfs(board, row + 1, col, nr, nc);
    }
}