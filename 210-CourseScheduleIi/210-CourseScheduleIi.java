// Last updated: 15/08/2026, 20:04:25
class Solution {
    static class Edge
    {
        int src,dest;
        Edge(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }
    public static void create(int adj[][],ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<adj.length;i++)
        {
           int src=adj[i][1];
           int dest=adj[i][0];
           graph[src].add(new Edge(src,dest));
        }
    }
    public static void calcIn(ArrayList<Edge> graph[],int inDeg[])
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                inDeg[e.dest]++;
            }
        }
    }
    public int[] findOrder(int n, int[][] adj) {
        int ans[]=new int[n];
        if(adj.length==0)
        {
            int x=n;
            for(int i=0;i<n;i++)
            {
                x--;
                ans[i]=x;
            }
            return ans;
        }
       
        ArrayList<Edge> graph[]=new ArrayList[n];
        int inDeg[]=new int[n];
        create(adj,graph);
        calcIn(graph,inDeg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(inDeg[i]==0)
            q.add(i);
        }
     
        int count=0;
        while(!q.isEmpty())
        {
          int curr=q.remove();
          ans[count]=curr;
          count++;
          for(int i=0;i<graph[curr].size();i++)
          {
            Edge e=graph[curr].get(i);
            inDeg[e.dest]--;
            if(inDeg[e.dest]==0)
            {
                q.add(e.dest);
            }
          }
        }
       return count == n ? ans : new int[0];
    }
}
