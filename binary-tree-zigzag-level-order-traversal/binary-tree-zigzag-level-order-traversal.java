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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root ==null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean reverse = false;
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i =0 ;i<size ;i++){
                TreeNode no = q.poll();
                if(!reverse){
                    temp.add(no.val);
                }else{
                    temp.addFirst(no.val);
                }
                
                if(no.left != null) q.add(no.left);
                if(no.right != null) q.add(no.right);
                
            }
            res.add(temp);
            reverse = !reverse;
        }
        return res;
    }
}