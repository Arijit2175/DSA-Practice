class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int ele : piles) r = Math.max(r, ele);
        int res = r;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            long hours = 0;
            for(int n : piles) hours += (n + mid - 1) / mid;
            if(hours <= h) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }
}