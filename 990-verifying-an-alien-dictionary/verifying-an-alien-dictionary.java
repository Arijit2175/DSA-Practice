class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freq = new int[26];
        for(int i = 0; i < order.length(); i++) freq[order.charAt(i) - 'a'] = i;
        for(int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());
            boolean flag = true;
            for(int j = 0; j < len; j++) {
                char ch1 = word1.charAt(j);
                char ch2 = word2.charAt(j);
                if(ch1 == ch2) continue;
                flag = false;
                if(freq[ch1 - 'a'] > freq[ch2 - 'a']) return false;
                break;
            }
            if(flag && word1.length() > word2.length()) return false;
        }
        return true;
    }
}