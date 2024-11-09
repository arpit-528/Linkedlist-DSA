class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode temp = head;
       ListNode front;
       ListNode prev= null;
       while (temp != null) {
        front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
       }
       return prev;
    }
}