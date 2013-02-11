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
public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
        
        ListNode newHead;
        if(l1.val < l2.val){
            newHead = l1;
            l1 = l1.next;
        }else{
            newHead = l2;
            l2 = l2.next;
        }
        
        ListNode cursor = newHead;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cursor.next = l1;
                l1 = l1.next;
            }else{
                cursor.next = l2;
                l2 = l2.next;
            }
            cursor = cursor.next;
        }
        
        if(l1 == null){
            cursor.next = l2;
        }
        
        if(l2 == null){
            cursor.next = l1;
        }
        
        return newHead;
    }
}
