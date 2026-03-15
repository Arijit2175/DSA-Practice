class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length < 2) return new int[0];
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) res[i] = res[i - 1] * nums[i - 1];
        int prod = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] *= prod;
            prod *= nums[i];
        }
        return res;
    }
}