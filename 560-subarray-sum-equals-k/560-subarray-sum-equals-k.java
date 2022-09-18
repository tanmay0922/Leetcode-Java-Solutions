class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  
        int sum =0;
        int ans =0;
        for(int i=0; i<n; i++ ){
            sum+=nums[i];
            int curr  = sum-k; 
            if(map.containsKey(curr)){
                ans+=map.get(curr); // frequency add.
            }
            
            if(!map.containsKey(sum)){  // if not contains key.
                map.put(sum,0);
            }
            // if containsKey
            map.put(sum,map.get(sum)+1);
           
        }
        return ans; 
    }
}