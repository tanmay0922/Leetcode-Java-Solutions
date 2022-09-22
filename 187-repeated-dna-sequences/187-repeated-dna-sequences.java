class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new LinkedList<>(); //created link list      
     HashSet<String> hs=new HashSet<>(); //creation of hashset and its usage
     for(int i=0;i<=s.length()-10;i++){  //loop till the length of the string s
         String temp=s.substring(i,i+10); //temp is used to store the substring part
         if(hs.contains(temp)){    //used for checking is it present in it.
             if(!ans.contains(temp))  //same
             ans.add(temp); 
         }
         hs.add(temp);
        
     }
        return ans; //return answer
    }
}