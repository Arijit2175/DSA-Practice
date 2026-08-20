class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return res;
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        if (totalLen > s.length()) return res;
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) map.merge(word, 1, Integer::sum);
        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> wmap = new HashMap<>();
            for (int j = 0; j < totalLen; j += wordLen) {
                String word = s.substring(i + j, i + j + wordLen);
                wmap.merge(word, 1, Integer::sum);
            }
            if (wmap.equals(map)) res.add(i);
        }
        return res;
    }
}