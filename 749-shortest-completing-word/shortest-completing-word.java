class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freq = new int[26];
        String res = "";
        for(int i = 0; i < licensePlate.length(); i++) {
            char ch = Character.toLowerCase(licensePlate.charAt(i));
            if(Character.isLetter(ch)) freq[ch - 'a']++;
        }
        for(int i = 0; i < words.length; i++) {
            int[] temp = new int[26];
            for(int j = 0; j < words[i].length(); j++) {
                char ch2 = words[i].charAt(j);
                temp[ch2 - 'a']++;
            }
        boolean flag = true;
        for(int k = 0; k < 26; k++) {
                if(temp[k] < freq[k]) {
                    flag = false;
                    break;
            }
        }
        if(flag) if(res.equals("") || words[i].length() < res.length()) res = words[i];
        }
        return res;
    }
}