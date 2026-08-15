// Last updated: 15/08/2026, 19:58:49
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static class Edge
    {
        int src,dest,wt;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class Pair 
    {
        int n,cost;
        Pair(int n,int c)
        {
            this.n=n;
            this.cost=c;
        }
        
    }
    public static void extract(ArrayList<ArrayList<Integer>> mainL,TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr.left!=null)
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(curr.val);
                list.add(curr.left.val);
                mainL.add(list);
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(curr.val);
                list.add(curr.right.val);
                mainL.add(list);
                q.add(curr.right);
            }
        }
    }
    public static void create(ArrayList<Edge> graph[],ArrayList<ArrayList<Integer>> mainL)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<mainL.size();i++)
        {
            ArrayList<Integer> list=mainL.get(i);
            int src=list.get(0);
            int dest=list.get(1);
            graph[src].add(new Edge(src,dest,1));
            graph[dest].add(new Edge(dest,src,1));
        }
    }
    public static int[] dijeskstra(ArrayList<Edge> graph[],int src)
    {
        int dist[]=new int[graph.length];
        boolean vis[]=new boolean[graph.length];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<Pair> pq=new LinkedList<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty())
        {
            Pair curr=pq.remove();
            if(!vis[curr.n])
            {
                vis[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++)
                {
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]+wt<dist[v])
                    {
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        return dist;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        int count=1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr.left!=null)
            {
                count++;
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                count++;
                q.add(curr.right);
            }
        }
        ArrayList<Edge> graph[]=new ArrayList[501];
        ArrayList<ArrayList<Integer>> mainL=new ArrayList<>();
        extract(mainL,root);
        create(graph,mainL);
        int dist[]=dijeskstra(graph,target.val);
        List<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<dist.length;i++)
        {
            if(dist[i]==k)
            ans.add(i);
           
        }
        return ans;
        
    }
}