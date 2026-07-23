class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> list = new ArrayList<>();
       for(int i = 0; i < nums.length; i++) {
        int start = nums[i];
        int j = i;
        while(j + 1 < nums.length && nums[j + 1] == nums[j] + 1) j++;
        if(start == nums[j]) list.add(String.valueOf(start));
        else list.add(start+"->"+nums[j]);
        i = j;
       } 
       return list;
    }
}