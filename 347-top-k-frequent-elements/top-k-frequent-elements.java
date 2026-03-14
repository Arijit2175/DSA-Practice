class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int n : nums) hash.put(n, hash.getOrDefault(n, 0) + 1);
        List<Integer> keys = new ArrayList<>(hash.keySet());
        Collections.sort(keys, (a, b) -> hash.get(b) - hash.get(a));
        int[] res = new int[k];
        for(int i = 0; i < k; i++) res[i] = keys.get(i);
        return res;
    }
}