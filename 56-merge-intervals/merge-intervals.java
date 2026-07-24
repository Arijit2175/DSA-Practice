class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++) {
            int[] last = list.get(list.size() - 1);
            if(intervals[i][0] <= last[1]) last[1] = Math.max(last[1], intervals[i][1]);
            else list.add(intervals[i]); 
        }
        int[][] res = new int[list.size()][2];
        for(int j = 0; j < list.size(); j++) res[j] = list.get(j);
        return res;
    }
}