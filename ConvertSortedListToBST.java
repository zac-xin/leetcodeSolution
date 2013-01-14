/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    // unable to pass address in java, so we need a global variable
    ListNode list = null;
    
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode cursor = head;
        list = head; // initialize a global variable
        int len = 0;
        while(cursor != null){
            cursor = cursor.next;
            len++;
        }
        
        return helper(0, len -1);
    }
    
    public TreeNode helper(int low, int high){
        if(low <= high){
            int mid = low + (high - low) /2;
            TreeNode leftSubtree = helper(low, mid - 1);
            TreeNode root = new TreeNode(list.val);
            root.left = leftSubtree;
            list = list.next;
            root.right = helper( mid + 1, high);
            return root;
        }
        return null;
    }
}
