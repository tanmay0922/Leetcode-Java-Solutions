class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer>[]g=new ArrayList[n]; //Linked List(Graph concept)
        for(int i=0;i<n;i++){ //loop till length of the list
            g[i]=new ArrayList(); //Array list is created
        }
        int[]in=new int[n]; //new array
        for(List<Integer> e:edges){ //loop from edge
            g[e.get(0)].add(e.get(1));//adding elments into e
            in[e.get(1)]++;
        }
        List<Integer> result=new ArrayList();
        for(int i=0;i<n;i++)
            if(in[i]==0)
                result.add(i);
        return result;
        
    }
}