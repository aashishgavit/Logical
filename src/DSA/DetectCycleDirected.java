package DSA;
import java.util.*;

public class DetectCycleDirected {

    // DFS function
    static boolean dfs(int node, boolean[] visited, boolean[] pathVisited, List<List<Integer>> adj) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : adj.get(node)) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, pathVisited, adj)) {
                    return true;
                }
            } 
            else if (pathVisited[neighbor]) {
                return true;  // cycle found
            }
        }

        pathVisited[node] = false;  // backtrack
        return false;
    }

    static boolean hasCycle(int V, List<List<Integer>> adj) {

        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, pathVisited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 3;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Create cycle: 0 → 1 → 2 → 0
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        if (hasCycle(V, adj))
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}