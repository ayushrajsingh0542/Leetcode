// Last updated: 15/08/2026, 19:49:14
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
    public void create(int edges[][],List<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++)
        {
            
            int src=edges[i][0];
            int dest=edges[i][1];
            int wt=edges[i][2];
            int wt2=2*wt;
            graph[src].add(new Edge(src,dest,wt));
            graph[dest].add(new Edge(dest,src,wt2));
        }
    }
    static class Info implements Comparable<Info>
    {
       int n;
       int c;
       Info(int n,int c)
       {
        this.n=n;
        this.c=c;
       }
       @Override
       public int compareTo(Info p2)
       {
        return this.c-p2.c;
       }
    }
    public int minCost(int n, int[][] edges) {
        List<Edge>graph[]=new ArrayList[n];
        create(edges,graph);
        PriorityQueue<Info>pq=new PriorityQueue<>();
        pq.add(new Info(0,0));
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        boolean vis[]=new boolean[n];
        while(!pq.isEmpty())
        {
            Info curr=pq.remove();
            if(!vis[curr.n])
            {
                vis[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++)
                {
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if( dist[u]+wt<dist[v])
                    {
                        dist[v]=dist[u]+wt;
                        pq.add(new Info(v,dist[v]));
                    }
                }
            }

        }
         return dist[n-1]==Integer.MAX_VALUE?-1:dist[n-1];

    }
}