class Solution {
    public String reverseWords(String s) {
     int temp=-1;
s=s+" ";
String ans="",str="";
for(int i=0;i<s.length();i++){
if(s.charAt(i)==' '){
for(int j=i-1;j>temp;j--){
str=str+ s.charAt(j);
}
temp=i;
ans=ans+str+" ";
str="";
}
else
continue;
}
ans=ans.trim(); //to remove extra white spaces
return ans;
}
}