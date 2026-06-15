class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {
       prefix = new int[nums.length];
       int cur = 0;
       for(int i = 0; i < nums.length; i++) {
        cur += nums[i];
        prefix[i] = cur;
       } 
    }
    
    public int sumRange(int left, int right) {
        int r = prefix[right];
        int l;
        if(left > 0) l = prefix[left - 1];
        else l = 0;
        return r - l;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */