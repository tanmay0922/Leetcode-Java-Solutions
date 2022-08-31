/*import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //return a list of lists
        ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            triangle.add(new ArrayList<Integer>());
            for(int j = 0; j < i + 1; j++){
                int next;
                // if on the outer wall of the triangle
                if(j == 0 || j == i){//j == i is equivalent to j == i + 1 - 1 which is rowSize - 1
                    next = 1; 
                }else{// if an inner cell of the triangle
                    next = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j); 
                }
                triangle.get(i).add(next);
            }
        }
        return triangle;
    }
}*/
//Basically based over ArrayList and if the condition matches then the number is being filled into the List!
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res =new ArrayList<List<Integer>>();//creation of List
        List<Integer>row,pre=null;
        for(int i=0;i<numRows;++i){
            row=new ArrayList<Integer>();//creation of ArrayList for rows
            for(int j=0;j<=i;++j)
                if(j==0||j==i)//condition
                    row.add(1);//ArrayList function
            else
                row.add(pre.get(j-1)+pre.get(j));
            pre=row;
            res.add(row);
        }
        return res;
        }
}
