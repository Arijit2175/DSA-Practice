class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < row1.length(); i++) {
            char ch = row1.charAt(i);
            map.put(ch, 1);
        }
        for(int i = 0; i < row2.length(); i++) {
            char ch2 = row2.charAt(i);
            map.put(ch2, 2);
        }
        for(int i = 0; i < row3.length(); i++) {
            char ch3 = row3.charAt(i);
            map.put(ch3, 3);
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int target = map.get(word.charAt(0));
            boolean flag = true;
            for(int j = 1; j < word.length(); j++) {
                if(map.get(word.charAt(j)) != target) {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(words[i]);
        }
        return list.toArray(new String[0]);
    }
}