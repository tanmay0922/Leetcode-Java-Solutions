class Solution {
    public boolean isPalindrome(String s) {
    String k=s.toLowerCase();
    String str=""; 
    String tr="";
    for(int i=0;i<k.length();i++){
    if(k.charAt(i)>='a'&&k.charAt(i)<='z'||k.charAt(i)>='A'&&k.charAt(i)<='Z'||
       k.charAt(i)>='0'&&k.charAt(i)<='9' )
     {
        str=k.charAt(i)+str;
            }
        }
     for(int i=0;i<k.length();i++){
     if(k.charAt(i)>='a'&&k.charAt(i)<='z'||k.charAt(i)>='A'&&k.charAt(i)<='Z'||k.charAt(i)>='0'&&k.charAt(i)<='9' ){
            tr=tr+k.charAt(i);
             }
        }

        if(tr.equals(str)){
            return true;
        }
        return false;
    }
}