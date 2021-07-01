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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(root ,targetSum , res , temp);
        return res;
    }
    
    private void dfs(TreeNode r , int s , List<List<Integer>> res ,List<Integer> temp ){
        if(r == null) return;
        temp.add(r.val);
        if(r.left == null && r.right ==null ){
            if(s == r.val){
                res.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        
        if(r.left!= null){
            dfs(r.left , s-r.val , res,temp);
            temp.remove(temp.size()-1);
        }
        if(r.right!= null){
            dfs(r.right , s-r.val , res,temp);
            temp.remove(temp.size()-1);
        }
    }
}