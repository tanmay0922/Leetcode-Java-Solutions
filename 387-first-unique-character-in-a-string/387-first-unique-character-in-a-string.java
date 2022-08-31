class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0)  return -1;//length checking
        int[] store = new int[26];//to keep a track
        for(char ch : s.toCharArray()){//for each loop(condition)
            store[ch - 'a']++;      }
        
        for(int i = 0; i < s.length(); i++){
            if(store[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;      
}
}