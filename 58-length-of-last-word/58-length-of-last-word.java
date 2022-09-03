class Solution {
    public int lengthOfLastWord(String s) {
        /*String w="";int c=0;
        for(int i=0;i<s.length();i++){
          char ch=  s.charAt(i);
            w=w+ch;
            if(ch.isWhitespace())
                c++;
        }
        return c;
    }
}*/
        //Basic Approach
       int n=s.length();
        while(n>0 &&s.charAt(n-1)==' ')
            n--;
        int i=n-1;
        while(i > -1 &&s.charAt(i)!=' ')
            i--;
        return n-1-i;
    }
}
        