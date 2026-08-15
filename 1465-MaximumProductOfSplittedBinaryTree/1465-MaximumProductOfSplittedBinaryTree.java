// Last updated: 15/08/2026, 19:55:10
class Solution {
    int mod = (int)(1e9 + 7);

    public long totSum(TreeNode root) {
        if (root == null)
         return 0;
         long left=totSum(root.left);
         long right=totSum(root.right);
        return left + right + root.val;
    }

    public long calc(TreeNode root, long total, long arr[]) {
        if (root == null) 
        return 0;

        long left = calc(root.left, total, arr);
        long right = calc(root.right, total, arr);

        long p1 = left + right + root.val;
        long p2 = total - p1;

        long prod = p1 * p2;
        arr[0] = Math.max(arr[0], prod);

        return p1;
    }

    public int maxProduct(TreeNode root) {
        long total = totSum(root);
        long arr[] = new long[1];

        calc(root, total, arr);

        return (int)(arr[0] % mod);
    }
}
