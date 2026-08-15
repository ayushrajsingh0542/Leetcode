// Last updated: 15/08/2026, 19:59:10
class Solution {
    static class Edge
    {
        int src,dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
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
            for(int dest:adj[i])
            {
                graph[dest].add(new Edge(dest,i));
            }
        }
    }
    public static void calcIn(ArrayList<Edge> graph[],int indeg[])
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topo(ArrayList<Edge> graph[],List<Integer> ans)
    {
        int indeg[]=new int[graph.length];
        calcIn(graph,indeg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++)
        {
            if(indeg[i]==0)
            q.add(i);
        }
       
        while(!q.isEmpty())
        {
            
            int curr=q.remove();
            ans.add(curr);
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0)
                {
                    q.add(e.dest);
                }
            }
        }
    }
    public List<Integer> eventualSafeNodes(int[][] adj) {

        ArrayList<Edge> graph[]=new ArrayList[adj.length];
        create(adj,graph);
        List<Integer> ans=new ArrayList<>();
        topo(graph,ans);
        Collections.sort(ans);
        return ans;
        
    }
}