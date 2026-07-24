class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();
        while(nums1.length > i && nums2.length > j) {
            if(nums1[i][0] == nums2[j][0]) {
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if(nums1[i][0] < nums2[j][0]) {
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                list.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }
        while(i < nums1.length) {
    list.add(new int[]{nums1[i][0], nums1[i][1]});
    i++;
}
while(j < nums2.length) {
    list.add(new int[]{nums2[j][0], nums2[j][1]});
    j++;
}
        int[][] res = new int[list.size()][2];
        for(int k = 0; k < list.size(); k++) res[k] = list.get(k);
        return res;
    }
}