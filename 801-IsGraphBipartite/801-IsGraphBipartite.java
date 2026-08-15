// Last updated: 15/08/2026, 19:59:21
class Solution {
    public static class Edge
    {
        int src;
        int dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[],int nodes[][])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<nodes.length;i++)
        {
            for(int j=0;j<nodes[i].length;j++)
            {
                int src=i;
                int dest=nodes[i][j];
                Edge e=new Edge(src,dest);
                graph[src].add(e);
            }
        }
    }
    public boolean isBipartite(int[][] nodes) {

        int v=nodes.length;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph,nodes);
        Queue<Integer> q=new LinkedList<>();
        int col[]=new int[v];
        Arrays.fill(col,-1);
        for(int i=0;i<v;i++)
        {
            if(col[i]==-1)
            {
                col[i]=0;
                q.add(i);
                while(!q.isEmpty())
                {
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++)
                    {
                        Edge e=graph[curr].get(j);
                        if(col[e.dest]==-1)
                        {
                            int nextCol=col[curr]==0?1:0;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }
                        else if(col[curr]==col[e.dest])
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
