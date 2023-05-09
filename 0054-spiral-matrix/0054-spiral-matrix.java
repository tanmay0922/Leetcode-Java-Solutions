class Solution {
    public List<Integer> spiralOrder(int[][] generateMatrix) {
       ArrayList <Integer> list=new ArrayList<>();
        int m = generateMatrix.length;
        int n = generateMatrix[0].length;
        int l=0,r=n-1,t=0,b=m-1;
        while(m*n>list.size()){
            for(int i=l;i<=r;i++){
                list.add(generateMatrix[t][i]);
              //  System.out.println(t+" "+i+" "+generateMatrix[t][i]);
            }
            for(int i=t+1;i<=b;i++){
                list.add(generateMatrix[i][r]);
            }
            if(t!=b){
                for(int i=r-1;i>=l;i--){
                    list.add(generateMatrix[b][i]); 
                }
            }
            if(r!=l){
                for(int i=b-1;i>t;i--){
                    list.add(generateMatrix[i][l]);
                }
            }
            t++;b--;l++;r--;
        }
        return list;
    }
}