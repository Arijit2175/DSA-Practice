class Solution {
    public int numIslands(char[][] grid) {
      int nr = grid.length;
      int nc = grid[0].length;
      int count = 0;
      for(int row = 0; row < nr; row++) {
        for(int col = 0; col < nc; col++) {
            if(grid[row][col] == '1') {
                count++;
                dfs(grid, row, col, nr, nc);
            }
        }
      }  
      return count;
    }
    public void dfs(char[][] grid, int row, int col, int nr, int nc) {
        if((row < 0) || (col < 0) || (row >= nr) || (col >= nc) || (grid[row][col] != '1')) return;
        grid[row][col] = '2';
        dfs(grid, row, col - 1, nr, nc); //left
        dfs(grid, row, col + 1, nr, nc); //right
        dfs(grid, row - 1, col, nr, nc); //top
        dfs(grid, row + 1, col, nr, nc); //down
    }
}