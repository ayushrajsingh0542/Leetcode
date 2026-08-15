// Last updated: 15/08/2026, 19:56:21
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
    public static void create(ArrayList<Edge> graph[],List<List<Integer>> adj)
    {
       for(int i=0;i<graph.length;i++)
       {
        graph[i]=new ArrayList<>();
       }
       for(int i=0;i<adj.size();i++)
       {
        List<Integer> list=adj.get(i);
        int src=list.get(0);
        int dest=list.get(1);
        graph[src].add(new Edge(src,dest));
        graph[dest].add(new Edge(dest,src));
       }
    }
    int timer=1;
    public void tarjan(int curr,int par,int tin[],int low[],boolean vis[],ArrayList<Edge> graph[],List<List<Integer>> ans)
    {
        vis[curr]=true;
        low[curr]=tin[curr]=timer;
        timer++;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(e.dest==par)
            continue;
            if(!vis[e.dest])
            {
                tarjan(e.dest,curr,tin,low,vis,graph,ans);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(low[e.dest]>tin[curr])
                {
                    ans.add(Arrays.asList(Math.min(e.dest,curr),Math.max(e.dest,curr)));
                }
            }
            else
            {
                low[curr]=Math.min(low[curr],low[e.dest]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
       ArrayList<Edge>graph[]=new ArrayList[n];
        List<List<Integer>> ans=new ArrayList<>();
        boolean vis[]=new boolean[n];
        create(graph,connections);
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            tarjan(i,-1,new int[n],new int[n],vis,graph,ans);
        }
        return ans;
    }
}

