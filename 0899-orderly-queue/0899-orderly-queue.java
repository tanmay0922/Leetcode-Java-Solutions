// Time Complexity: O(N ^ 2)
// Space Complexity: O(N)
class Solution {
    public String orderlyQueue(String s, int k) {
        String ans = s;
        if (k == 1) {
          
            for (int i = 0; i < s.length(); i++) {
                String t = s.substring(i) + s.substring(0, i);
                if (ans.compareTo(t) > 0) {
                    ans = t;
                }
            }
        } else {
          
            char[] ca = ans.toCharArray();
            Arrays.sort(ca);
            ans = new String(ca);
        }
        return ans;
    }
}