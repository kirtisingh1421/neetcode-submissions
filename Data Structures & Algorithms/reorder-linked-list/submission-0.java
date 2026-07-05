class Solution {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t = slow.next;
        slow.next = null;
        ListNode curr = t;
        ListNode forw = t;
        ListNode prev= null;
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        ListNode t1 = head;
        ListNode t2 = prev;
        while(t1 != null && t2 != null){
            ListNode a = t1.next;
            ListNode b = t2.next;
            t1.next = t2;
            t2.next = a;
            t1 = a;
            t2= b; 
        }
        temp = head;
    }
}
