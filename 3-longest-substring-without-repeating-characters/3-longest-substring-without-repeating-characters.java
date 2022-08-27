class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int longest=0;
        int[] arr = new int[128];
        for(int i=0, j=0; j<s.length(); j++){
            i = Math.max(arr[s.charAt(j)], i);
            longest = Math.max(longest, j-i+1);
            arr[s.charAt(j)] = j+1;
        }
        return longest;
    }
}
    