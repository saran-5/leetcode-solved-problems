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
    int c = 0;
    int r = 0;
    public int kthSmallest(TreeNode root, int k) {
        in(root,k);
        return r;
    }
    private void in(TreeNode root, int k){
        if(root == null) return;
        in(root.left,k);
        c++;
        if(c==k) r=root.val;
        in(root.right,k);
    }
}