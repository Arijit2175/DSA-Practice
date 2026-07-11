class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        int res = 0;
        for(int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < words.length; i++) {
            int[] temp = new int[26];
            String curr = words[i];
            for(int j = 0; j < curr.length(); j++) {
                char ch2 = curr.charAt(j);
                temp[ch2 - 'a']++;
            }
            boolean valid = true;
            for(int k = 0; k < 26; k++) {
                if(temp[k] > freq[k]) {
                    valid = false;
                    break;
                }
            }
            if(valid) res += curr.length();
        }
        return res;
    }
}