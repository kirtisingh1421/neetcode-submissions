class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(t1 != null || t2 != null || carry != 0){
            int sum = carry;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            carry = sum / 10;
            int digit = sum % 10;
            temp.next = new ListNode(digit);
            temp = temp.next;
        }
        if(carry > 0){
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

