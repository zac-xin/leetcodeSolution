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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = 0;
        ListNode cursor = head;
        while(cursor != null){
            cursor = cursor.next;
            length++;
        }
        
        if(length == 0){
            return null;
        }
        n = n % length;
        
        ListNode n1 = head;
        ListNode n2 = head;
        
        while(n > 0){
            n2 = n2.next;
            n--;
        }
        
        while(n2.next != null){
            n2 = n2.next;
            n1 = n1.next;
        }
        
        n2.next = head;
        head = n1.next;
        n1.next = null;
        
        return head;
    }
}