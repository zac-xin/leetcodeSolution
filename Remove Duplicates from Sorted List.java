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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null)
            return null;
        
        if(head.next == null){
            return head;
        }
        
        ListNode n1 = head;
        ListNode n2 = head.next;
        
        while(n2 != null){
            if(n1.val != n2.val){
                n1.next = n2;
                n1 = n2;
                n2 = n2.next;
            }else{
                n1.next = null;
                n2 = n2.next;
            }
            
        }
        
        return head;
    }
}