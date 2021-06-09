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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> n = new LinkedList<TreeNode>();
        if(root == null) return res;
        n.offer(root);
        while(!n.isEmpty()){
            int count = n.size();
            List<Integer> r = new LinkedList<Integer>();
            while(count>0){
                if(n.peek().left != null) n.offer(n.peek().left);
                if(n.peek().right != null) n.offer(n.peek().right);
                count--;
                r.add(n.poll().val);
                
            }
            res.add(r);
        }
        return res;
    }
}