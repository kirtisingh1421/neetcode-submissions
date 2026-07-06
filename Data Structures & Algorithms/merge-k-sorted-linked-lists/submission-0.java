class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists) arr.add(n);
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy =  new ListNode(-1);
        ListNode k = dummy;
        ListNode i = head1;
        ListNode j = head2;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else{
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }
        if(i != null) k.next = i;
        else k.next = j;
        return dummy.next;
    }
}



// if(lists == null || lists.length == 0) return null;
//         ArrayList<ListNode> arr1 = new ArrayList<>();
//         ArrayList<ListNode> arr2 = new ArrayList<>();
//         for(ListNode n : lists) arr1.add(n);
//         while(arr1.size()+arr2.size() > 1){
//             while(arr1.size() > 1){
//                 ListNode a = arr1.get(arr1.size()-1);
//                 arr1.remove(arr1.size()-1);
//                 ListNode b = arr1.get(arr1.size()-1);
//                 arr1.remove(arr1.size()-1);
//                 ListNode c = merge(a,b);
//                 arr2.add(c);
//             }
//             while(arr2.size() > 1){
//                 ListNode a = arr2.get(arr2.size()-1);
//                 arr2.remove(arr2.size()-1);
//                 ListNode b = arr2.get(arr2.size()-1);
//                 arr2.remove(arr2.size()-1);
//                 ListNode c = merge(a,b);
//                 arr1.add(c);
//             }
//         }
//         if(arr2.size() ==1 && arr1.size() == 0){
//             arr1.add(arr2.remove(0));
//         }
//         return arr1.isEmpty() ? arr2.get(0) : arr1.get(0);
//     }
//     public ListNode merge(ListNode head1, ListNode head2){
//         if(head1 == null) return head2;
//         if(head2 == null) return head1;
//         ListNode t1 = head1;
//         ListNode t2 = head2;
//         ListNode dummy = new ListNode(-1);
//         ListNode k = dummy;
//         while(t1 != null && t2 != null){
//             if(t1.val < t2.val){
//                 k.next = t1;
//                 t1 = t1.next;
//                 }
//             else{
//                 k.next = t2;
//                 t2 = t2.next;
//             }
//             k = k.next;
//         }
//         if(t1 == null){
//             k.next = t2;
//         }
//         else{
//             k.next = t1;
//         }
//         return dummy.next;