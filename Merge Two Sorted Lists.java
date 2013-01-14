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
 
 //solution 1 using recursion
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
public class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1 == null || l2 == null){
            return (l1 == null) ? l2 : l1;
        }
        
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
 
 //solution 2
public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ListNode current;
        ListNode newHead;
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        if(l1 == null || l2 == null){
            return (l1 == null) ? l2 : l1;    
        }
        
        if(l1.val < l2.val){
            newHead = new ListNode(l1.val);
            l1 = l1.next;
        }else{
            newHead = new ListNode(l2.val);
            l2 = l2.next;
        }
        
        ListNode pre = newHead;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                current = new ListNode(l2.val);
                l2 = l2.next;
            }
            pre.next = current;
            pre = current;
        }
        
        if(l1 != null){
            pre.next = l1;
        }
        
        if(l2 != null){
            pre.next = l2;
        }
        
        return newHead;
    }
}
