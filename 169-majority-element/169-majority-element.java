class Solution {
    public int majorityElement(int[] nums) {
        //Working for small inputs but failing over huge test case(Not Optimised.)
       /* Arrays.sort(nums);
        for(  int i = 0; i < nums.length-1 ;  i=i+2){
if(nums[i] == nums[i+1]){
return nums[i];
}
else{
break;//Just to break one iteration in the loop and start with another one.
}
}
return nums[nums.length - 1];
}
}*/
       // Now the Best and Optimised Approach is Moorey's Voting Algo.
    int c=0,candi=0;
        for(int num:nums){//Duplicate is being created so that the result may not be effected.
            if(c==0){
                candi=num;
        }
        if(num==candi)//Matching is being done
            c=c+1;//Increase the c value
        else
            c=c-1;//Decrease the c value
        }
    return candi;
}
}

