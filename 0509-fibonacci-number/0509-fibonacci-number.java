class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int s=0;
        int f=1;
        for(int i=2;i<=n;i++)
        {
            int cur=s+f;
            s=f;
            f=cur;
        }
        return f;
        }
    }
