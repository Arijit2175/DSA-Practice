class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int n : set) {
            if(n > first) {
                third = second;
                second = first;
                first = n;
            } else if(n > second) {
                third = second;
                second = n;
            } else if(n > third) third = n;
        } 
        if(set.size() < 3) return first;
        else return third;
    }
}