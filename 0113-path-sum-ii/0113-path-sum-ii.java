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
        
        dfs(root, targetSum, new ArrayList<>());
        return res;
    }

    private void dfs(TreeNode node,
                     int remainingSum,
                     List<Integer> path) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (remainingSum == node.val) {
                res.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
                return;
            }
        }
            dfs(node.left, remainingSum - node.val, path);
            dfs(node.right, remainingSum - node.val, path);

        path.remove(path.size() - 1);
    }
}