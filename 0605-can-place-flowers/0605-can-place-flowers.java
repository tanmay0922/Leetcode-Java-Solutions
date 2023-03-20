class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      if (n == 0) { //base Case
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) { //loop till flowerbed length
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) { //condition (adjancency)
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}