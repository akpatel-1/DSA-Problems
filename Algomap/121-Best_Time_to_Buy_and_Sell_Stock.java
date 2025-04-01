/*
Problem: 121. Best Time to Buy and Sell Stock
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 
Approach: Initilize min=prices[0] , profit = 0 ; loop prices array and find min and profit for each day. Return porfit.

TC: O(n) n=prices.length;
SC: O(1) int min and profit.
 */

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0] , profit = 0;
        for(int i=1 ; i<prices.length ; i++){
            min = Math.min(prices[i] , min);
            profit = Math.max(prices[i]-min , profit);
        }
        return profit;
    }
}