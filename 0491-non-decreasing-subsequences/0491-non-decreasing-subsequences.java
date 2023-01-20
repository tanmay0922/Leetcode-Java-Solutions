class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
      Set<List<Integer>>al=new HashSet<List<Integer>>();
        List<Integer>ds=new ArrayList<>();
        check(al,nums,0,ds,Integer.MIN_VALUE);
        List res=new ArrayList(al);
        return res;
    }
    public static void check(Set<List<Integer>>al,int nums[],int ind,List<Integer>ds,int prev){
        if(ds.size()>1){
                al.add(new ArrayList<>(ds));
        }
        for(int i=ind;i<nums.length;i++){
            if(nums[i]>=prev){
                ds.add(nums[i]);
                check(al,nums,i+1,ds,nums[i]);
                ds.remove(ds.size()-1);
            }
        }
    }
}  
