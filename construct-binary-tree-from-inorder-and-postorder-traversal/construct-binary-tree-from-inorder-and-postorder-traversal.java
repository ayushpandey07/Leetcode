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
    int postIdx;
    Map<Integer, Integer> indexes;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder == null) return null;
        postIdx = postorder.length-1;
        indexes = new HashMap();
        for(int i =0; i<inorder.length; i++){
            indexes.put(inorder[i],i);     
        }
        return helper(postorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] postorder, int iStart, int iEnd){
        if(postIdx<0 || iStart>iEnd)
            return null;
        int idx = indexes.get(postorder[postIdx]);
        TreeNode node = new TreeNode(postorder[postIdx--]);
        node.right = helper(postorder,idx+1, iEnd);
        node.left = helper(postorder, iStart, idx-1);
        return node;
    }
}