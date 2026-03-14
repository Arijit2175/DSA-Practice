class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int t = target - nums[i];
            if(hash.containsKey(t)){
                int[] arr = new int[]{i, hash.get(t)};
                return arr;
            } else {
                hash.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}