class Solution {
    public boolean containsDuplicate(int[] nums) {
       /* int c=0;
        int n;
        
       //int c=0;
        for(int i=0;i<n;i++){
            //c=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                c++;
            
        }
        
    }
        if(c<0)
          return   true;
        else
           return  false;
        
}
}*/ 
         Arrays.sort(nums);
    for(int i =0;i<nums.length-1;i++){
       if( nums[i]==nums[i+1]) {
                         return true; 
       }
    }
    return false;
}
}
    