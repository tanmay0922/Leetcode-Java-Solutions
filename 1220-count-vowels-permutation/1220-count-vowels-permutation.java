class Solution {
    long dp[][];
    int MOD = (int)1e9+7;
    public int countVowelPermutation(int n) {
        dp = new long[n+1][26];

        // for(int arr[] : dp){
        //     Arrays.fill(arr,-1);
        // }
      return (int)((solve(n-1,'a') + solve(n-1,'e') + solve(n-1,'i') + solve(n-1,'o') + solve(n-1,'u')) % MOD);
    }

    public long solve(int n, char previousChar){
        if(n == 0){
            return 1;
        }

        if(dp[n][previousChar -'a']  != 0){
            return dp[n][previousChar -'a'] ;
        }

        long count = 0;
        if(previousChar == 'a'){
            count = solve(n-1,'e');
        }
        else if(previousChar == 'e'){
            count = (solve(n-1,'a') + solve(n-1,'i'));
        }
        else if(previousChar == 'i'){
            count = solve(n-1,'a') + solve(n-1,'e') + solve(n-1,'o') + solve(n-1,'u');
        }
        else if(previousChar == 'o'){
            count = solve(n-1,'i') + solve(n-1,'u');
        }
        else if(previousChar == 'u'){
            count = solve(n-1,'a');
        }
        return dp[n][previousChar -'a'] = (count % MOD);
    }
}