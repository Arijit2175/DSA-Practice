class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int case1 = robRange(nums, 0, nums.length - 2);
        int case2 = robRange(nums, 1, nums.length - 1);
        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 2];
        dp[1] = nums[start];
        for(int i = 2; i <= end - start + 1; i++) dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i - 1]);
        return dp[end - start + 1];
    }
}