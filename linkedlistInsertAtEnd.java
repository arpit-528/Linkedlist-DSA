class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x); 
        if(head == null) {
            head = temp;
        } else {
            Node mover = head;
            while(mover.next != null) {
                mover = mover.next;
            }
            mover.next = temp;
        }        
        return head;
    }
    }