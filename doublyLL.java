class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newnode=new Node(arr[i]);
            temp.next=newnode;
            newnode.prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
