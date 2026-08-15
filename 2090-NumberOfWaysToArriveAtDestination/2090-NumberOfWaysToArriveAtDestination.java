// Last updated: 15/08/2026, 19:52:46
import java.util.*;

class Solution {
    static class Edge {
        int src, dest, wt;
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Info implements Comparable<Info> {
        int node;
        long cost;
        Info(int n, long c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Info p2) {
            return Long.compare(this.cost, p2.cost);
        }
    }

    public static void create(int[][] roads, ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int src = road[0], dest = road[1], wt = road[2];
            graph[src].add(new Edge(src, dest, wt));
            graph[dest].add(new Edge(dest, src, wt)); // bidirectional
        }
    }

    public int countPaths(int n, int[][] roads) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        create(roads, graph);

        PriorityQueue<Info> pq = new PriorityQueue<>();
        pq.add(new Info(0, 0));
        long[] dist = new long[n];
        int[] ways = new int[n];
        int MOD = 1_000_000_007;

        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;

        while (!pq.isEmpty()) {
            Info curr = pq.remove();
            int node = curr.node;
            long currCost = curr.cost;

            if (currCost > dist[node]) continue;

            for (Edge e : graph[node]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    ways[v] = ways[u];
                    pq.add(new Info(v, dist[v]));
                } else if (dist[u] + wt == dist[v]) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }

        return ways[n - 1];
    }
}
