class Solution {
    public int[] twoSum(int[] nums, int target) {
       /*int m=0,n=0;
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
        
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target)
                {   m += i;
                    n += j;
                    break;}
            }
        }
        ans[0] = m;
        ans[1] = n;
        return ans;
    }
} */
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i=1; i<nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
        
}
    
    