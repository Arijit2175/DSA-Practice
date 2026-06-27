class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r) {
            int width = r - l;
            int heights = Math.min(height[l], height[r]);
            int area = width * heights;
            max = Math.max(area, max);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
}