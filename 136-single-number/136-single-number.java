class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        /*int c=0,i;
        for(i=0;i<=nums.length;i++){
            for(int j=i;j<=nums.length;j++){
                if(nums[i]==nums[j])
                    c++;
                if(c>1)
                return nums[i];
            }
            
        }
        return nums[i];
    }
}*/
        int i = 0;
for( ; i < nums.length-1 ; i= i+2){
if(nums[i] != nums[i+1]){
return nums[i];
}
else{
continue;//Just to break one iteration in the loop and start with another one.
}
}
return nums[nums.length - 1];
}
}