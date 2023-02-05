class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()){
            return res;
        }
        int[] ct1 = new int[26];
        int[] ct2 = new int[26];

        int k = p.length();

        for(char it : p.toCharArray()){
            ct1[it-'a']++;
        }

        int i = 0;

        while(i < k){
            ct2[s.charAt(i++)-'a']++;
        }

        k = s.length();
        int j = 0;

        if(Arrays.equals(ct1, ct2)){
            res.add(j);
        }

        while(i < k){

            ct2[s.charAt(j++)-'a']--;
            ct2[s.charAt(i++)-'a']++;

            if(Arrays.equals(ct1, ct2)){
                res.add(j);
            }
        }

        return res;
    }
}