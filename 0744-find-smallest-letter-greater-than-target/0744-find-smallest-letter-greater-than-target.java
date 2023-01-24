class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //Brtute-Force Approach
      /* for(char c:letters){
           if(c>target)
               return c;
       }
        return letters[0];
    }
}*/
         int start=0;
        int end=letters.length-1;
        if (target>letters[end])
            return letters[0];
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target<letters[mid])
               end=mid-1;
            else
                start=mid+1;
        }
    
                /*if (target<letters[mid])
                    end=mid-1;
            if (target==letters[mid])
                return letters[mid+1];
        }*/
       return letters[start % letters.length];
}
}               
