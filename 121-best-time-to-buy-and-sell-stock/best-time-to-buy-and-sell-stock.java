class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            profit = prices[i] - min;
            max = Math.max(profit, max);
        }
        return max;
    }
}