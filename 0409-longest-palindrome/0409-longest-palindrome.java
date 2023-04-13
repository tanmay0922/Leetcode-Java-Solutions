class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     int longer_length=0;
     boolean odd_Check= false;   
        
        // character mapping using key and value pair. into hashamp. and frequency increasing.
    for(int i=0; i<s.length(); i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
    }
     
     // iterate over the hashmap value. is it even or odd check. 
        // count even value and odd value.
    for(int value : map.values()){
        if(value%2==0){
            longer_length+=value;
        }else{
            longer_length+=value-1;
            odd_Check = true;
        }
    }
        // if odd length then +1.
        if(odd_Check) longer_length++; // odd
        
        return longer_length; // even 
        
    }
}