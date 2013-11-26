public class Solution {
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( head == null ){
            return null;
        }
        
        if(head.next == null) {
            return head;
        }
        
        ListNode n0 = new ListNode(0);
        ListNode n1 = head;
        ListNode n2 = head.next;
        
        ListNode p = n0;
              
        while(n1 != null && n2 != null){
            n1.next = n2.next;
            n2.next = n1;
            n0.next = n2;
            
            if(n1.next == null){
                break;
            }
            
            n2 = n1.next.next;
            n0 = n1;
            n1 = n1.next;
        }
        
        return p.next;
    }
}