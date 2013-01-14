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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        boolean done = false;
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(!done){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                if(stack.empty()){
                    done = true;
                }else{
                    current = stack.pop();
                    result.add(current.val);
                    current = current.right;
                }
                
            }
            
        }
        
        return result;
        
    }
}