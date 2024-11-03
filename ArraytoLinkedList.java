class Solution {
    static Node constructLL(int arr[]) {
        // code here
        int size = arr.length;
        Node head = null;
        Node tail = null;
        if(size == 0 ) return null;
        for(int i = 0; i < size; i++) {
            Node newnode = new Node(arr[i]);
            if(head == null ) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode ;
                tail = newnode;
            }
        }
    
        return head;
    }
}
