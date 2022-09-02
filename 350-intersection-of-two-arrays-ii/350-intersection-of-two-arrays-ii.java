class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1=new ArrayList<>();
        ArrayList<Integer> set2=new ArrayList<>();
        
        for(int n:nums1){
            set1.add(n);
        }
        
        for(int n:nums2){
            if(set1.contains(n)){
                set2.add(n);
                set1.remove(Integer.valueOf(n));
            }
        }
        int[] ans=new int[set2.size()];
        
        for(int i=0;i<set2.size();i++){
            ans[i]=set2.get(i);
        }
        return ans;
    }
}
    