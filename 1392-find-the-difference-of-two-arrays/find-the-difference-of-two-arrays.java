class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int ele : nums1) set1.add(ele);
        for(int n : nums2) set2.add(n);
        for(int i : set1) if(!set2.contains(i)) list1.add(i);
        for(int j : set2) if(!set1.contains(j)) list2.add(j);
        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}