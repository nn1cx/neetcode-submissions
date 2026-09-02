class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }

            int currProfit = prices[i] - lowestPrice;
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }
        }

        return maxProfit;
    }
}
