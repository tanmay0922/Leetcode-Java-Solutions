class Solution {
    static int calculate_nCr(int n, int r){
         if(r > n - r) r = n - r; // because C(n, r) == C(n, n - r)
         long ans = 1;
         int i;
         for(i = 1; i <= r; i++) {
            ans *= n - r + i;
            ans /= i;
         }

         return (int)ans;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        for(int i=0; i<=rowIndex; i++){
            list.add(calculate_nCr(rowIndex,i));
        }
        return list;
    }
}