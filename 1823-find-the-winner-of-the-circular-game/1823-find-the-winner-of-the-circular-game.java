class Solution {
    public int findTheWinner(int n, int k) {
       List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)list.add(i);
        play(0,k,k,list);
        return list.get(0);
    }
    public void play(int i, int n, int k, List<Integer> list){
        if(list.size()==1) return;
        if(i==list.size())i=0;
        if(n==1){
            list.remove(i);
            i--;
            n=k+1;
        }
        play(i+1,n-1,k,list);
    }
} 
    