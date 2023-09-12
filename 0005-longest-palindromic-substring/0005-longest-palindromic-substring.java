public class Solution 
{ public int lo, result;
	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s; //checking length of substring
	
	    for (int i = 0; i < len-1; i++) {
    	 	solve(s, i, i);//call of solve function
     		solve(s, i, i+1);
	    }
    	return s.substring(lo, lo + result);//returning statement
	}
	public void solve(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (result < k - j - 1) {
			lo = j + 1;
			result = k - j - 1;
		}
	}
}