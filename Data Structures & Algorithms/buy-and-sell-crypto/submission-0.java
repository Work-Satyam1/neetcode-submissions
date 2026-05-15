class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int price : prices)
        {
            // Buy at minimum price
            minPrice = Math.min(minPrice, price);
            
            // Sell today
            int profit = price - minPrice;
            
            // Store maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}