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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num == null || num.length == 0)
            return null;
        
        return helper(num, 0, num.length - 1);
    }
    
    public TreeNode helper(int[] num, int low, int high){
        TreeNode n = null;
        if(low <= high){
            int mid = low + (high - low) / 2;
            n = new TreeNode(num[mid]);
            n.left = helper(num, low, mid - 1);
            n.right = helper(num, mid + 1, high);
        }
        return n;
    }
}