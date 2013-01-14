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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode n1 = head;
        ListNode n2 = head;
        
        while(n > 0 && n1 != null){
            n1 = n1.next;
            n--;
        }
        
        // be careful when we want to delete the first element
        if(n1 == null){
            head = n2.next;
            return head;
        }
        
        while(n1.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        
        n2.next = n2.next.next;
        
        return head;
    }
}