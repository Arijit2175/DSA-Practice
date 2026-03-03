class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[]{intervals[0][0], intervals[0][1]});
        for(int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] prev = res.get(res.size() - 1);
            if(curr[0] <= prev[1]) prev[1] = Math.max(curr[1], prev[1]);
            else res.add(new int[]{curr[0], curr[1]});
        }
        return res.toArray(new int[res.size()][]);
    }
}