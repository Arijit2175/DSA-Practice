class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        int res = 0;
        boolean flag = false;
        for(int n : map.values()) {
            if(n % 2 == 0) res += n;
            else {
                res += n - 1;
                flag = true;
            }
        }
        if(flag) res++;
        return res;
    }
}