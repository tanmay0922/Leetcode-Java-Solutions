class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
          List<Boolean> tan=new ArrayList<>();
        int may=0; 
        for(int i=0;i<nums.length;i++){
            may=(may*2+nums[i])%5;
            if(may==0)
            tan.add(true);
            else
            tan.add(false);
           //may=may*2+nums[i];
            /*if(may%5==0)
                tan.add(true);
            else
                tan.add(false);*/
            
        }
        return tan;
    }
}