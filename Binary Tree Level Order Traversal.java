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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null)
            return result;
        
        queue.add(root);
        int currentLevel = 1;
        int nextLevel = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!queue.isEmpty()){
            TreeNode n = queue.remove();
            currentLevel--;
            list.add(n.val);
            
            if(n.left != null){
                queue.add(n.left);
                nextLevel++;
            }
            if(n.right != null){
                queue.add(n.right);
                nextLevel++;
            }
            
            if(currentLevel == 0){
                result.add(list);
                list = new ArrayList<Integer>();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
        
        return result;
        
    }
}