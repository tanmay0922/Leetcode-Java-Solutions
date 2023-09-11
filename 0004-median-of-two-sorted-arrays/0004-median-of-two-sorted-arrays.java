class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mergeArr[] = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                mergeArr[k++] = nums1[i++];
            }
            else {
                mergeArr[k++] = nums2[j++];
            }
        }
        if(i < m) {
            while(i < m) 
                mergeArr[k++] = nums1[i++];
        }
        if(j < n) {
            while(j < n)
                mergeArr[k++] = nums2[j++];
        }
        int total = n + m;
        if(total % 2 == 1) {
            return mergeArr[((total + 1)/2) - 1];
        } else {
            return ((double)mergeArr[(total/2) - 1] + (double)mergeArr[(total/2)])/2.0;
        }
    }
}