class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();//Creation of hashmap
        for(int i = 0; i < s.length(); i++){ //loop till length of the string
            char ch = s.charAt(i);//picking each character from string s
            map.put(ch, i);//putting one by one into the hashmap created
        }
        List<Integer> ans = new ArrayList<>();//Dynamically array List is created 
        int prev = -1; //prev index
        int max = 0;//max index
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch)); //max index is stored 
            if(max == i){
                ans.add(max - prev);
                prev = max;
            }
        }
        return ans;
    }
}