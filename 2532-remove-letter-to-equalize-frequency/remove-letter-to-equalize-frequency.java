class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] == 0) continue;
            freq[i]--;
        int target = 0;
        boolean valid = true;
        for(int j = 0; j < 26; j++) {
            if(freq[j] == 0) continue;
            if(target == 0) target = freq[j];
            if(freq[j] != target) {
                valid = false;
                break;
            }
        }
        if(valid) return true;
        else freq[i]++;
    }
    return false;
    }
}