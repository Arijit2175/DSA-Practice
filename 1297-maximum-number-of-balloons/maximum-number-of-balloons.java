class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
            b = freq['b' - 'a'];
            a = freq['a' - 'a'];
            l = freq['l' - 'a'] / 2;
            o = freq['o' - 'a'] / 2;
            n = freq['n' - 'a'];
    }
    return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
}
}