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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode small = null;
        ListNode big = null;
        ListNode smallHead = null;
        ListNode bigHead = null;
        
        if(head == null)
            return null;
            
        while(head != null){
            if(head.val < x){
                if(smallHead == null){
                    smallHead = new ListNode(head.val);
                    small = smallHead;
                }else{
                    small.next = new ListNode(head.val);
                    small = small.next;
                }
            }else{
                if(bigHead == null){
                    bigHead = new ListNode(head.val);
                    big = bigHead;
                }else{
                    big.next = new ListNode(head.val);
                    big = big.next;
                }
            }
            head = head.next;
        }
        
        if(smallHead == null){
            return bigHead;
        }else{
            small.next = bigHead;
            return smallHead;
        }
    }   
}
