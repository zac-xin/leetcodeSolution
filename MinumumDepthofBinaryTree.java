/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.*;
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        int level = 1;
        int currentLevel = 1;
        int nextLevel = 0;
        
        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            if(current.left == null && current.right == null){
                return level;
            }
            currentLevel--;
            if(current.left != null){
                queue.add(current.left);
                nextLevel++;
            }
            if(current.right != null){
                queue.add(current.right);
                nextLevel++;
            }
            if(currentLevel == 0){
                level++;
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
        return Integer.MAX_VALUE;
    }
}