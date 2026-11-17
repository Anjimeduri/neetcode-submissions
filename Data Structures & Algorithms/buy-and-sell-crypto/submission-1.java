class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // 5,1,5,6,7,1,10
        int left = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = Math.max(profit, prices[i] - left);
            } else {
                left = Math.min(prices[i], left);
            }
        }

        return profit;
    }
}
