class Solution {
    public int maxProfit(int[] prices) {
        //P.S.-Can't buy on 2 nd day and no selling on 1st day.
      int maxProfit = 0;
int minSo = prices[0];//Minimum so far
for(int i = 0; i < prices.length; i++){
minSo = Math.min(minSo, prices[i]);
int profit = prices[i] - minSo;//Calculating Profit
maxProfit = Math.max(maxProfit, profit);
}
return maxProfit;
}
}  
    