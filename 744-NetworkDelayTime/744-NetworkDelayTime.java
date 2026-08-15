// Last updated: 15/08/2026, 19:59:40
class Solution {
    public static class Edge
    {
        int src,dest,wt;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
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
            int src=adj[i][0];
            int dest=adj[i][1];
            int wt=adj[i][2];
            graph[src].add(new Edge(src,dest,wt));
        }
    }
    public static class Info implements Comparable <Info>
    {
        int n;
        int cost;
        Info(int n,int c)
        {
            this.n=n;
            this.cost=c;
        }
        @Override
        public int compareTo(Info p2)
        {
            return this.cost-p2.cost;
        }
    }
    public static void dijekstra(ArrayList<Edge> graph[],int src,int dist[])
    {
        
        boolean vis[]=new boolean[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Info> q=new PriorityQueue<>();
        q.add(new Info(src,0));
        while(!q.isEmpty())
        {
            Info curr=q.remove();
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
                        q.add(new Info(v,dist[v]));
                    }
                }
            }
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<Edge>[] graph = new ArrayList[n + 1]; // Adjusted for 1-based indexing
        create(times, graph);

        int[] dist = new int[n + 1];
        dijekstra(graph, k, dist);

        int ans = 0;
        for (int i = 1; i <= n; i++) { // Iterate from 1 to n
            if (dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
        
    
}
}