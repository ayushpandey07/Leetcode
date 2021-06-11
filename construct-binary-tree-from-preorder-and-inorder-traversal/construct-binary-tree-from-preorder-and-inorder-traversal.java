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
    Map<Integer , Integer> inorderMP;
    int preIndex ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         preIndex = 0;
         inorderMP = new HashMap<>();
        for(int i = 0 ; i < inorder.length ;i++){
            inorderMP.put(inorder[i],i);
        }
        return helper(preorder , 0, preorder.length-1);
    }
    private TreeNode helper(int[] preorder ,int l , int r){
        if(l> r) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder , l , inorderMP.get(rootVal)-1);
        root.right = helper(preorder ,  inorderMP.get(rootVal)+1 , r);
        return root;
    }
}