/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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
        
        boolean flag = false;
        
        while(n1 != null && n2 != null){
            n1.next = n2.next;
            n2.next = n1;
            n0.next = n2;
            
            if(!flag){
                head = n2;
                flag = true;
            }
            
            if(n1.next == null){
                break;
            }
            n2 = n1.next.next;
            n0 = n1;
            n1 = n1.next;
        }
        
        return head;
    }
}