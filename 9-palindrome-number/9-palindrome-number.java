class Solution {
    public boolean isPalindrome(int x) {
     
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
     
        return (x == res || x == res / 10);
    }
}
//Brute-Force Approach...
 /*int r=0;int m=n;//Duplicate is being created.
while(n!=0){
    int d=n%10;
   int r=r*10+d;//generalised formula for finding the reverse.
    n=n/10;
}
if(m==r)
    return m;
}
}*/
