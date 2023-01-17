class Solution {
    public int minFlipsMonoIncr(String s) {
        int z=0;
        int o=0;
        for(char ch:s.toCharArray()){
            if(ch=='0')
                z++;
        }
        int ou=z;
        for(char ch:s.toCharArray()){
            if(ch=='0')
                z--;
        
        else if(ch=='1')
            o++;
        ou=Math.min(ou,z+o);
        }
        return ou;
    }
}