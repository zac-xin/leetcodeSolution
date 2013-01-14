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
   boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        flag = true; // reset for leetcode judge system
        helper(root);
        if (!flag)
            return false;

        return true;
    }

    public int helper(TreeNode n) {
        if (!flag)
            return -1;

        if (n == null)
            return 0;

        int leftDepth = helper(n.left);

        if (leftDepth == -1) {
            flag = false;
            return -1;
        }

        int rightDepth = helper(n.right);

        if (rightDepth == -1) {
            flag = false;
            return -1;
        }

        int diff = Math.abs(leftDepth - rightDepth);

        if (diff > 1) {
            flag = false;
            return -1;
        }

        int deeper;

        if (leftDepth > rightDepth)
            deeper = leftDepth;
        else
            deeper = rightDepth;

        return deeper + 1;

    }
}