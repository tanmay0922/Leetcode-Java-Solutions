class Solution {
    /*int[][] memo;
    int[] coins;

    public int numberOfWays(int i, int amount) {
        if (amount == 0) {
            return 1;
        }
        if (i == coins.length) {
            return 0;
        }
        if (memo[i][amount] != -1) {
            return memo[i][amount];
        }

        if (coins[i] > amount) {
            return memo[i][amount] = numberOfWays(i + 1, amount);
        }

        memo[i][amount] = numberOfWays(i, amount - coins[i]) + numberOfWays(i + 1, amount);
        return memo[i][amount];
    }

    public int change(int amount, int[] coins) {
        this.coins = coins;
        memo = new int[coins.length][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return numberOfWays(0, amount);
    }
}*/
    public int change(int amount,int[] coins){
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=amount;i++){
            dp[0][i]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=amount;j++){
                if(coins[i]>j){
                    dp[i][j]=dp[i+1][j];
                }else{
                    dp[i][j]=dp[i+1][j]+dp[i][j-coins[i]];
                }
            }
        }
        return dp[0][amount];
    }
}