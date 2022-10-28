class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){ //for each loop
            char[] count = new char[26]; //created a array for 26 alphabets
            for (char c : str.toCharArray())  //Picking one by one each character
                count[c - 'a']++; //Value of counter being increased
            String s = String.valueOf(count);
            if(!map.containsKey(s)) //condition
                map.put(s, new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
} 
    