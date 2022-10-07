class Solution {
    public String convert(String s, int numRows) {
          //Define StringBuilders
        StringBuilder[] sbs = new StringBuilder[numRows];//String Builder(Dynamic)
        for(int i = 0; i < numRows; i++){    //loop till numsrow
            sbs[i] = new StringBuilder();    //adding elements one by one into sbs array
        }
        
        //Define Variables
        char[] arr = s.toCharArray(); //picking one by one character
        int n = arr.length; //length of array
        int index = 0; //index pe zero hae
        
        //Traverse zig zag
        while(index < n){ //0<length
            //Go down
            for(int j = 0; j < numRows && index < n; j++){ //loop
                sbs[j].append(arr[index++]);//inbuilt function to add
            }
            //Go Up before start
            for(int j = numRows - 2; j > 0 && index < n; j--){ //loop
                sbs[j].append(arr[index++]);
            }
        }
        
        //Combine all stringbuilders into one
        StringBuilder res = sbs[0];
        for(int i = 1; i < numRows; i++){
            res.append(sbs[i].toString());
        }
        return res.toString();//conversion
    }
}
