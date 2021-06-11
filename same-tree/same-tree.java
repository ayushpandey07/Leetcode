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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(!check(p,q)) return false;
        ArrayDeque<TreeNode> pq = new ArrayDeque<>();
        ArrayDeque<TreeNode> qq = new ArrayDeque<>();
        pq.add(p);
        qq.add(q);
        while(!pq.isEmpty()){
            p = pq.removeFirst();
            q = qq.removeFirst();
            if(!check(p,q)) return false;
            if(p!=null){
                if(!check(p.left,q.left)) return false;
                if(p.left != null){
                    pq.addLast(p.left);
                    qq.addLast(q.left);
                }
                if(!check(p.right,q.right)) return false;
                if(p.right !=null){
                    pq.addLast(p.right);
                    qq.addLast(q.right);
                }
            }
        }
        return true;
       
    }
    private boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p==null || q == null) return false;
        if(p.val != q.val) return false;
        return true;
        
    }
}