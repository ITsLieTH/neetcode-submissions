class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0, l = 1;
        int maxProfit = 0;

        while (l < prices.length) {
            int diff = prices[l] - prices[i];
            if (diff > 0) {
                maxProfit = Math.max(maxProfit, diff);
            } else {
                i = l;   
            }
            l++;
        }
        return maxProfit;
    }
}
