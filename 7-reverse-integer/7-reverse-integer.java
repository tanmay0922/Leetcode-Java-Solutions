class Solution {
    public int reverse(int x) {
//         Storing the final result after reversing
       long result = 0;
//         reversing the given integer using while loop
		while(x != 0){
//                   : result:  :last int:
			result = result*10 + x%10;
			x /= 10;
		}
		if(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE)
			return (int)result;
		else
			return 0;
    }
}