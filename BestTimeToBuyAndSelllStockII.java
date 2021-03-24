class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, pL = prices.length;
        for(int i = 0; i < pL-1; i++){
            if(prices[i] < prices[i+1]){
                profit = profit + (prices[i+1] - prices[i]);
            }
        }
        return profit;
        
        
    }
}