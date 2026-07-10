class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r) {
            if(!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            } 
            if(!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            } 
            char ch1 = Character.toLowerCase(s.charAt(l));
            char ch2 = Character.toLowerCase(s.charAt(r));
            if(ch1 != ch2) return false;
            l++;
            r--;
        }
        return true;
    }
}