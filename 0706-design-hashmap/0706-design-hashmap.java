class MyHashMap {
    private class MyHashNode {
        private int key;
        private int value;
        
        public MyHashNode(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }   
    }
    
    private List<MyHashNode>[] buckets;
    
    public MyHashMap() {
        buckets = new LinkedList[10000];
    }
    
    public void put(int key, int value) {
        int bucket_index = getHash(key);
        int list_index = getListIndex(key, bucket_index);
        
        if (buckets[bucket_index] == null) {
            buckets[bucket_index] = new LinkedList<>();
        }
        
        List<MyHashNode> list = buckets[bucket_index];
        
        if (list_index == -1) {
            list.add(new MyHashNode(key, value));
        } else {
            MyHashNode node = list.get(list_index);
            node.value = value;
        }
    }
    
    public int get(int key) {
        int bucket_index = getHash(key);
        int list_index = getListIndex(key, bucket_index);
        return list_index != -1 ? buckets[bucket_index].get(list_index).value : -1;
    }
    
    public void remove(int key) {
        int bucket_index = getHash(key);
        int list_index = getListIndex(key, bucket_index);
        if (list_index != -1) {
            buckets[bucket_index].remove(list_index);
        }
    }
    
    private int getHash(int key) {
        return Integer.hashCode(key) % buckets.length;
    }
    
    private int getListIndex(int key, int index) {
        if (buckets[index] != null) {
            for (int i = 0, j = 0; i < buckets[index].size(); i++, j++) {
                if (buckets[index].get(i).key == key){
                    return j;
                }
            }
        }
        return -1;
    }
}
//Array out of Index 
   /* int[]map;
    public MyHashMap(){
        map=new int[1000000];
        for(int i=0;i<map.length;i++) map[i]=-1;
    }
    public void put(int key,int value){
        map[key]=value;
    }
    public int get(int key){
        return map[key];
    }
    public void remove(int key){
        map[key]=-1;
    }
}*/


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */