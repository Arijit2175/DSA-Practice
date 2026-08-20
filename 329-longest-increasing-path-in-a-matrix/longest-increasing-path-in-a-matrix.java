class Solution {
    static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        int res = 0;
        for(int i = 0; i < matrix.length; i++) for(int j = 0; j < matrix[0].length; j++) res = Math.max(res, dfs(matrix, i, j));
        return res;
    }

    int dfs(int[][] matrix, int r, int c) {
        if(dp[r][c] != 0) return dp[r][c];
        int best = 1;
        for(int[] dir : dirs) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr >= 0 && nr < matrix.length && nc >= 0 && nc < matrix[0].length && matrix[nr][nc] > matrix[r][c]) best = Math.max(best, 1 + dfs(matrix, nr, nc));
        }
        dp[r][c] = best;
        return best;
    }
}