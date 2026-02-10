class Solution {
    public int longestBalanced(int[] nums) {
        int res = 0;
        for(int l = 0; l < nums.length; l++) {
            Set<Integer> even = new HashSet<>();
            Set<Integer> odd = new HashSet<>();
            for(int r = l; r < nums.length; r++) {
                if(nums[r] % 2 == 0) even.add(nums[r]);
                else odd.add(nums[r]);
                if(even.size() == odd.size()) res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}