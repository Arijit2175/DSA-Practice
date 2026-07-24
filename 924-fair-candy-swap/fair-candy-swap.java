class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int i = 0; i < aliceSizes.length; i++) sumA += aliceSizes[i];
        for(int i = 0; i < bobSizes.length; i++) sumB += bobSizes[i];
        int diff = (sumB - sumA) / 2;
        Set<Integer> set = new HashSet<>();
        for(int n : bobSizes) set.add(n);
        for(int i = 0; i < aliceSizes.length; i++) {
            if(set.contains(aliceSizes[i] + diff)) return new int[]{aliceSizes[i], aliceSizes[i] + diff};
        }
        return new int[0];
    }
}