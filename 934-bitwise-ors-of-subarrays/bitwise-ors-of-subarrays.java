class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> prev = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            Set<Integer> curr = new HashSet<>();
            curr.add(arr[i]);
            for(int x : prev) curr.add(x | arr[i]);
            res.addAll(curr);
            prev = curr;
        }
        return res.size();
    }
}