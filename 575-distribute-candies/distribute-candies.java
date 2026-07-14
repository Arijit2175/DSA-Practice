class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < candyType.length; i++) set.add(candyType[i]);
        int unique = set.size();
        int allowed = candyType.length / 2;
        return Math.min(unique, allowed);
    }
}