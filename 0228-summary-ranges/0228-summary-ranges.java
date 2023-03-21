class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> re=new ArrayList();
        int n=nums.length;
        if(n==0)
            return re;
        int a=nums[0]; 
        for(int i=0;i<n;++i){
            if(i==n-1||nums[i]+1!=nums[i+1]){
                if(nums[i]!=a)
                    re.add(a+"->"+nums[i]);
                else
                    re.add(a+"");
                if(i!=n-1)
                    a=nums[i+1];
            }
        }
        return re;
    }
}