class Solution {
    public boolean wordPattern(String pattern, String s) {
 String[] str = s.split(" ");
    
    if(pattern.length()!=str.length)
        return false;
    //Mapping the pattern values to string as keys
    HashMap<Character, String> hm = new HashMap<>();
    
    for(int i=0; i<pattern.length(); i++){
        
        char c = pattern.charAt(i);
        
        if(hm.containsKey(c)){
            
            if(!hm.get(c).equals(str[i]))
                return false;
            
        } else{
            
            if(hm.containsValue(str[i]))
                return false;
            
            hm.put(c, str[i]);
        }
        
    }
    
    return true;
    
}
}