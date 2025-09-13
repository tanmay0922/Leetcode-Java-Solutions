class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     int [] ans= new int[k];
     HashMap<Integer, Integer> hm = new HashMap<>();
     for (int i=0;i<nums.length;i++){
        if (hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
        }else{
            hm.put(nums[i],1);
        }
     }   
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
    for (int Key: hm.keySet()){
        pq.add(new int [] {Key, hm.getOrDefault(Key,0)});

    }
    for (int i=0;i<k;i++){
        int[] temp= pq.remove();
        ans[i]= temp[0];
    }
    return ans;
    }
}