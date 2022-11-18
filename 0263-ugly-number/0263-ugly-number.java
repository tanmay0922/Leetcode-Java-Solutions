class Solution {
    public boolean isUgly(int n) {
    if(n==0) //Base Case
        return false;
        //checking for prime factors
        if(n==1) 
            return true;
        //to find the factors we did the mod thing and for getting the particular number or output we needed to check the factors by grtting quotient.
        if(n%2==0) return isUgly(n/2);
        else if(n%3==0) return isUgly(n/3);
         else if(n%5==0) return isUgly(n/5);
        return false;
    }
}