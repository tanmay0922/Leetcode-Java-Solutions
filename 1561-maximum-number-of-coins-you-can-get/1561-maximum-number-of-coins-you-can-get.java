class Solution {
    public int maxCoins(int[] piles) {
       /* Arrays.sort(piles);
        ArrayDeque<Integer> queue = new ArrayDeque();
        for (int num : piles) {
            queue.addLast(num);
        }
        
        int ans = 0;
        while (!queue.isEmpty()) {
            queue.removeLast(); // alice
            ans += queue.removeLast(); // us
            queue.removeFirst(); // bob
        }
        
        return ans;
    }
}*/
        Arrays.sort(piles);
        int ans=0;
        for(int i=piles.length/3;i<piles.length;i+=2){
            ans+=piles[i];
        }
        return ans;
    }
}