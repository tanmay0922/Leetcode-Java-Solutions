class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size =strs.length;
        if(size==0)
            return "";
        if (size==1)
            return strs[0];
        Arrays.sort(strs);
        int end =Math.min(strs[0].length(),strs[size-1].length());
        int a=0;
        while(a < end && strs[0].charAt(a)==strs[size-1].charAt(a))
            a++;
        String prefix =strs[0].substring(0,a);
        return prefix;
    }
}