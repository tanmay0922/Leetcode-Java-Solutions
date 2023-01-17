/*Algo:
1.iterate and keep a track of zeros
2.As we got the count of zeros then iterate again and decrement the zeros and increment the ones
3.After each calculations,we determine the output by the formula:output = Math.min(output, zeroes+ones)*/


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