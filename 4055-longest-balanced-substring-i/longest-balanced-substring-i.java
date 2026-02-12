class Solution {
    public int longestBalanced(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for(int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'a']++;
                int min = Integer.MAX_VALUE;
                int max = 0;
                for(int k = 0; k < 26; k++) {
                    if(count[k] > 0) {
                        min = Math.min(min, count[k]);
                        max = Math.max(max, count[k]);
                    }
                }
            if(min == max) res = Math.max(res, j - i + 1);
        }
    }
    return res;
    }
}