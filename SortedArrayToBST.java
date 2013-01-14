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
        return convert(num, 0, num.length - 1);
    }
    
    public TreeNode convert(int a[], int low, int high){
        if(low <= high){
            int mid = (low + high) / 2;
            TreeNode root = new TreeNode(a[mid]);
            TreeNode left = convert(a, low, mid -1);
            TreeNode right = convert(a, mid + 1, high);
            root.left = left;
            root.right = right;
            return root;
        }
        return null;
    }
}