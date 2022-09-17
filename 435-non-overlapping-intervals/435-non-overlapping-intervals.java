class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;//Length of matrix
        
        if(n == 0) { //If n is i.e.length is 0 then the value returned is 0
            return 0;
        }
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));//Comparator
        
        int i=0, j=1, nonOverlappingIntervals = 0;
        
        while(j<n) {
            if(intervals[i][1] > intervals[j][0]) {   //condition
                if(intervals[i][1] > intervals[j][1]) {  //2nd index
                    i = j;  //
                }
                nonOverlappingIntervals++;     
            } else {
                i = j;
            }
            j++;
        }
        
        return nonOverlappingIntervals;
    }
}