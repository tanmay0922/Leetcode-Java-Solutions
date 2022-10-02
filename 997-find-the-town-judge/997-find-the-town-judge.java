class Solution {
    public int findJudge(int n, int[][] trust) {
         int[] Trusted = new int[n+1]; //trusted array created
        for(int[] person : trust){ //for each loop
            Trusted[person[0]]--;
            Trusted[person[1]]++;
        }
        for(int i = 1;i < Trusted.length;i++){
            if(Trusted[i] == n-1) return i;
        }
        return -1;
    }
    }
