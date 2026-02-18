class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l = 0;
        long count = 0, curr = 0;
        for(int r = 0; r < nums.length; r++) {
            curr += nums[r];
            while(curr * (r - l + 1) >= k) {
                curr -= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}