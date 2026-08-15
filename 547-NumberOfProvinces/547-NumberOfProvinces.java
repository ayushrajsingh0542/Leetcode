// Last updated: 15/08/2026, 20:01:32
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
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[])
    {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            dfs(graph,e.dest,vis);
        }
    }
    public static void create(int isConnected[][],ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1)
                {
                    int src=i+1;
                    int dest=j+1;
                    graph[src].add(new Edge(src,dest));
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        ArrayList<Edge> graph[]=new ArrayList[V+1];
        create(isConnected,graph);
        int count=0;
        boolean vis[]=new boolean[V+1];
        for(int i=1;i<V+1;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(graph,i,vis);
            }
        }
        return count;
        
    }
}