class Solution {
    public boolean hasAlternatingBits(int n) {
        int res = n&1;
        while(n != 0) {
            n = n >> 1;
            if(res == (n&1)) return false;
            res = n&1;
        }
        return true;
    }
}