// Last updated: 15/08/2026, 19:57:50
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
    static class Info
    {
        TreeNode node;
        int x;
        int y;
        Info(TreeNode n,int x,int y)
        {
            this.node=n;
            this.x=x;
            this.y=y;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
         Queue<Info> q = new LinkedList<>();
        List<int[]> list = new ArrayList<>();

        q.add(new Info(root, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            TreeNode node = curr.node;
            int x = curr.x;
            int y = curr.y;

            list.add(new int[]{x, y, node.val});  // Store x, y, val for sorting

            if (node.left != null) {
                q.add(new Info(node.left, x - 1, y - 1));
            }
            if (node.right != null) {
                q.add(new Info(node.right, x + 1, y - 1));
            }
        }

        
        Collections.sort(list,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            if(a[1]!=b[1]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[2],b[2]);
        });

        List<List<Integer>> ans=new ArrayList<>();
        int arr[]=list.get(0);
        int comp=arr[0];
        List<Integer>compList=new ArrayList<>();
        compList.add(arr[2]);
       
        for(int i=1;i<list.size();i++)
        {
             arr=list.get(i);
            if(comp!=arr[0])
            {
                ans.add(compList);
                compList=new ArrayList<>();
                compList.add(arr[2]);
                comp=arr[0];
            }
            else if(comp==arr[0])
            {
                compList.add(arr[2]);
            }
        }
        ans.add(compList);


         return ans;
        
    }
}