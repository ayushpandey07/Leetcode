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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null ) return res;
        pathSumHelper(root , targetSum , new LinkedList<Integer>());
        return res;
    }
    private void pathSumHelper(TreeNode root, int targetSum , LinkedList<Integer> temp){
        if(root == null) return;
                temp.add(root.val);

        if(root.left == null && root.right == null && root.val == targetSum) res.add(new ArrayList<>(temp));
        pathSumHelper(root.left , targetSum-root.val , temp);
        pathSumHelper(root.right , targetSum-root.val , temp);
        temp.removeLast();

    }
}