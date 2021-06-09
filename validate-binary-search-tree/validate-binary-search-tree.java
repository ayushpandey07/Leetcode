/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root ,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    private boolean helper(TreeNode r , long min , long max){
        if(r == null) return true;
        if(r.val >= max || r.val <= min) return false;
        
        return (helper(r.left,min , r.val) && helper(r.right ,  r.val ,max));
    }
}