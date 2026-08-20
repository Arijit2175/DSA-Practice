class Solution {
    public String smallestSubsequence(String s) {
      int[] freq = new int[26];
      boolean[] used = new boolean[26];
      for(char ch : s.toCharArray()) freq[ch - 'a']++;
      Stack<Character> stack = new Stack<>();
      for(char ch : s.toCharArray()) {
        freq[ch - 'a']--;
        if(used[ch - 'a']) continue;
        while(!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0) {
            char removed = stack.pop();
            used[removed - 'a'] = false;
        }
        stack.push(ch);
        used[ch - 'a'] = true;
      }
      StringBuilder sb = new StringBuilder();
      while(!stack.isEmpty()) sb.append(stack.pop());
      return sb.reverse().toString();  
    }
}