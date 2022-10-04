class Solution {
    public String frequencySort(String s) {
	// Count the occurence on each character
	HashMap<Character, Integer> cnt = new HashMap<>(); //hashmap created
	for (char c : s.toCharArray()) { //for each loop
		cnt.put(c, cnt.getOrDefault(c, 0) + 1); //insert a key value into the map
	}
	
	// Sorting
	List<Character> chars = new ArrayList(cnt.keySet()); //Array List is being created
	Collections.sort(chars, (a, b) -> (cnt.get(b) - cnt.get(a))); //Collection framework concept

	// Build string
	StringBuilder sb = new StringBuilder(); //mutuable modified
	for (Object c : chars) { //for each loop
		for (int i = 0; i < cnt.get(c); i++) {//for loop 
			sb.append(c); //add at the end
		}
	}
	return sb.toString(); //convert and return
}
}