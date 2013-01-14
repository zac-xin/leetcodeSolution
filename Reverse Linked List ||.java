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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n - m == 0){
            return head;
        }
        
        int len = n - m;
        
        ListNode sen = new ListNode(0);
        sen.next = head;
        
        ListNode n0 = sen;
        ListNode n1 = head;
        while(m > 1){
            n0 = n0.next;
            n1 = n1.next;
            m--;
        }
        
        ListNode n2 = head;
        
        while(n > 1){
            n2 = n2.next;
            n--;
        }
        
        n0.next = n2;
        ListNode pre = n1;
        ListNode current = n1.next;
        n1.next = n2.next;
        
        while(len > 0){
            ListNode nextCopy = current.next;
            current.next = pre;
            pre = current;
            current = nextCopy;
            len--;
        
        }
        return sen.next;
    }
}