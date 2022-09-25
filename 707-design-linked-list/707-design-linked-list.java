//Designing of the linked list by using linked list functions 
class MyLinkedList {
    
    Node head;
    int size;

    class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val = val;
        }
    }
    //No need to implement anything as by default head will be null and size will be 0
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        Node temp = head;
        int count = 0;
        while(count != index){
            temp = temp.next;
            count++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if(size == 0)
            addAtHead(val);
        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            Node newNode = new Node(val);
            temp.next = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size)
            return;
        
        if(index == 0)
            addAtHead(val);
        else if(index == size)
            addAtTail(val);
        else{
            Node temp = head;
            int count = 0;
            while(count != index-1){
                temp = temp.next;
                count++;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;
        
        if(index == 0){
            Node temp = head.next;
            head = temp;
            size--;
        } else {
            int count = 0;
            Node pre = head;
            while(count != index-1){
                pre = pre.next;
                count++;
            }
            pre.next = pre.next.next;
            size--;
        }
    }
}