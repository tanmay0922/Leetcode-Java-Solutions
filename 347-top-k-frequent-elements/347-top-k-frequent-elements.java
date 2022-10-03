class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        int[] result = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hs.get(b)-hs.get(a));
        pq.addAll(hs.keySet());
        int i=0;
        while(!pq.isEmpty() && k>0){
            result[i++]=pq.remove();
            k--;
        }
        return result;
    }
}