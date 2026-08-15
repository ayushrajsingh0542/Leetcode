// Last updated: 15/08/2026, 19:59:17
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
    public static void create(ArrayList<Edge> graph[],int flights[][])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++)
        {
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];
            graph[src].add(new Edge(src,dest,wt));
        }
    }
    static class Info
    {
        int n,cost,stops;
        Info(int n,int c,int s)
        {
            this.n=n;
            this.cost=c;
            this.stops=s;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge> graph[]=new ArrayList[n];
        int dist[]=new int[n];
        Queue<Info> q=new LinkedList<>();
        create(graph,flights);
        q.add(new Info(src,0,0));
        for(int i=0;i<n;i++)
        {
            if(i!=src)
            dist[i]=Integer.MAX_VALUE;
        }
        int ans=0;
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            if(curr.stops>k)
            {
                break;
            }
            for(int i=0;i<graph[curr.n].size();i++)
            {
                Edge e=graph[curr.n].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(curr.cost+wt<dist[v] && curr.stops<=k)
                {
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        ans=dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
        return ans;
    }
}