class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        for(int i = 0; i < words[0].length(); i++) freq[words[0].charAt(i) - 'a']++;
        for(int i = 1; i < words.length; i++) {
            int[] temp = new int[26];
            for(int j = 0; j < words[i].length(); j++) temp[words[i].charAt(j) - 'a']++;
            for(int k = 0; k < 26; k++) freq[k] = Math.min(freq[k], temp[k]);
            }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < freq[i]; j++) list.add(String.valueOf((char)(i + 'a')));
        }
        return list;
    }
}