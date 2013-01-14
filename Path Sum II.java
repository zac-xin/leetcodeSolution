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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        helper(root, sum, list, result);
        
        return result;
    }
    
    public void helper(TreeNode n, int sum, ArrayList<Integer> list, 
                            ArrayList<ArrayList<Integer>> result){
        if(n == null){
            return;
        }
        
        list.add(n.val);
        
        sum -= n.val;
        
        if(sum == 0 && n.left == null && n.right == null){
            result.add(list);
            return;
        }
        
        ArrayList<Integer> leftList = new ArrayList<Integer>(list);
        ArrayList<Integer> rightList = new ArrayList<Integer>(list);
        
        helper(n.left, sum, leftList, result);
        helper(n.right, sum, rightList, result);
        
    }
}