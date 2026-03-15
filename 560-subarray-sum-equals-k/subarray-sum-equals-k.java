class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int sum = 0; 
        int count = 0;
        for(int n : nums) {
            sum += n;
            if(hash.containsKey(sum - k)) count += hash.get(sum - k);
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}