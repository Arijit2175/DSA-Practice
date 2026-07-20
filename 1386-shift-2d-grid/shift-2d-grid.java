class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] res = new int[grid.length * grid[0].length];
        int p = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) res[p++] = grid[i][j];
        }
        k %= (grid.length * grid[0].length);
        reverse(res, 0, res.length - 1);
        reverse(res, 0, k - 1);
        reverse(res, k, res.length - 1);
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++) row.add(res[idx++]);
            result.add(row);
        }
        return result;
    }

    static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}