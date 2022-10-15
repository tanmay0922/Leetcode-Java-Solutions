class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length(); //length of the array
        int[][] dp = new int[110][110]; //2D Array
        for (int i = 0; i <= n; i++)  //loop till length(first loop)
            for (int j = 0; j <= n; j++) //loop till length(second loop)
                dp[i][j] = 9999; //max value
		        dp[0][0] = 0;    //min value
        for(int i = 1; i <= n; i++) { //loop till length
            for(int j = 0; j <= k; j++) {      //loop till length           
                int cnt = 0, del = 0; //cnt and del both are initilized as zero
                for(int l = i; l >= 1; l--) {  
                    if(s.charAt(l - 1) == s.charAt(i - 1)) cnt++;
                    else del++;
                    if(j - del >= 0) 
                        dp[i][j] = Math.min(dp[i][j], 
                                            dp[l-1][j-del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1: 0));
                }
                if (j > 0)
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
            }
        }
        return dp[n][k];
    }
}
    
    