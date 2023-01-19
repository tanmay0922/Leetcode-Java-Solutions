class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int rem;
        for(int i=0;i<nums.length;i++){
            if(i>0)
                nums[i]+=nums[i-1];
            rem=(nums[i]%k+k)%k;
            map.put(rem,map.getOrDefault(rem,0)+1);
            
        }
        int r=map.getOrDefault(0, 0);
        for(int frequency:map.values()){
            r+=frequency*(frequency-1)/2;
            
        }
        return r;
    }
}