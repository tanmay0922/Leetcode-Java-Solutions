class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       /* HashSet<Integer>hs=new HashSet<>();
         HashSet<Integer>hs1=new HashSet<>();
        for(int i=0;i<m;i++){
            int j=nums1[i];
            hs.add(j);
            
        }
        for(int i=0;i<n;i++)
            int j=nums2[i];
        hs1.add(j);
    }
    int []answer=new int[hs1.size()];
    int i=0;
    for(int num:hs1){
        answer[i++]=num;
    }
    return answer;
}
}
        Map<Integer,Boolean>mp=new TreeMap<Integer,Boolean>();
        for(int i=0;i<m;i++){
            mp.put(nums1[i],true);
            
        }
for(int i=0;i<n;i++){
            mp.put(nums2[i],true);
            
        }
        for(Map.Entry<Integer,Boolean>me:mp.entrySet()){
            System.out.println(me.getKey()+" ");
        }
    }
}*/
      
        
        /*int index = nums1.length - 1;   // Index for insertion (From The End)
        int i = m-1;                    // Index for nums1 (From The End)
        int j = n-1;                    //Index for nums2 (From The End)
        
        // Traversing From The End Of The Array Inserting Elements In Sorted Manner
        while(index >= 0){
            
            int nums1Value = (i >= 0) ? nums1[i] : Integer.MIN_VALUE;
            int nums2Value = (j >= 0) ? nums2[j] : Integer.MIN_VALUE;
            
            if(nums1Value > nums2Value){
                nums1[index] = nums1Value;
                i--;
            }else{
                nums1[index] = nums2Value;
                j--;
            }
            
            index--;
        }
    }
}*/
        int i = m-1;
       int j = n-1;
       int k = m+n-1;
        
        while(i>=0 && j>=0) {
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
        
        //remaining elements
        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
        return;
    }
}