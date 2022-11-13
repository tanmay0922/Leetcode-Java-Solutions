class Solution {
    public String reverseWords(String s) {
        /*String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; --i){
            str.append(words[i] + " "); 
        }

        return str.toString().trim();
    }
}*/
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}