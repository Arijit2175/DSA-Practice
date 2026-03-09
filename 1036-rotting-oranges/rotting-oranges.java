class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        while(true) {
            boolean changed = false;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == 2) {
                        if(i > 0 && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = 3;
                            changed = true;
                        }
                        if(i < grid.length - 1 && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = 3;
                            changed = true;
                        }
                        if(j > 0 && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = 3;
                            changed = true;
                        }
                        if(j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = 3;
                            changed = true;
                        }
                    }
                }
            }
            if(!changed) break;
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    if(grid[i][j] == 3) grid[i][j]=2;
                }
            }
            minutes++;
        }
        for(int[] row : grid){
            for(int cell : row){
                if(cell == 1) return -1;
            }
        }
        return minutes;
    }
}