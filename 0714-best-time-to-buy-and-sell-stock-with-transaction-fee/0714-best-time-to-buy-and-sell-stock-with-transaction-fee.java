class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int [] feex=new int[n],hold =new int[n];
        hold[0]=-prices[0];
        for(int i=1;i<n;i++){
            hold[i]=Math.max(hold[i-1],feex[i-1]-prices[i]);
            feex[i]=Math.max(feex[i-1],hold[i-1]+prices[i]-fee);
        }
        return feex[n-1];
    }
}