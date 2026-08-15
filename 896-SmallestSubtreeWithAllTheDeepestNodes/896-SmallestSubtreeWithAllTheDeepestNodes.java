// Last updated: 15/08/2026, 19:58:45
class Solution {
    public int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null)
            return null;
        int lh = height(root.left), rh = height(root.right);
        if (lh == rh)
            return root;
        if (lh > rh)
            return subtreeWithAllDeepest(root.left);
        else
            return subtreeWithAllDeepest(root.right);
    }
}