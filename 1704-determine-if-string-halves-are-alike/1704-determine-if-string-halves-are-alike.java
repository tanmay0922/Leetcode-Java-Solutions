class Solution {
    public boolean halvesAreAlike(String s) {
       int n=s.length(); //length of the string
        int count=0; //counter
        for(int i=0;i<n/2;i++){ //As We have even input as justified so For splitting we did it into two halves.
            if(isVowel(s.charAt(i))){ //If found vowel then increase value of counter
                count++; //counter increment
            }
        }
        for(int i=n/2;i<n;i++){ //Second half
            if(isVowel(s.charAt(i))){ //same checking of the vowel in the secind half.
                count--; //decrement of counter
            }
        }
        if(count==0){ //counter of first half-second half counter if yes then return true
            return true;
        }
        return false;
    }
    public boolean isVowel(char ch){
        //check with the vowels
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'
            ||ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                return true;
            }
            return false;
    }
}