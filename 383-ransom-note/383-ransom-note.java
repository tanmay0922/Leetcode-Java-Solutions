class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[128];
        for (final char ch : magazine.toCharArray())
            ++counter[ch];
        for (final char ch : ransomNote.toCharArray())
            if (--counter[ch] < 0)
                return false;
        return true;     
    }
}