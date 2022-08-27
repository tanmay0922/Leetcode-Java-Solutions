class Solution {
    public int findDuplicate(int[] nums) {
        //T.C.-O(n*n);
       /*int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return len;
    }
}*/
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {//used to add a specific element into a Set collection.
                return nums[i];
            }
        }

        return len;
    }
}