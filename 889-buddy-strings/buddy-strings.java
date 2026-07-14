class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        Set<Character> set = new HashSet<>();
        if(s.equals(goal)) {
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) return true;
            set.add(s.charAt(i));
        }
        return false;
    }
    int first = -1;
    int second = -1;
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) != goal.charAt(i)) {
            if(first == -1) first = i;
            else if(second == -1) second = i;
            else return false;
        }
    }
    if(first == -1 || second == -1) return false;
    return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}