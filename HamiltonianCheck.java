package Practice;
import java.util.*;

public class HamiltonianCheck {
    static boolean found = false;
    public static void main(String[] args) {
        int[][] graph = {
            {0,1,1,0},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,0}
        };
        boolean[] visited = new boolean[graph.length];
        dfs(graph,0,visited,1);
        if (found) System.out.println("Hamiltonian Path exists.");
        else System.out.println("No Hamiltonian Path.");
    }
    static void dfs(int[][] graph, int current, boolean[] visited, int count) {
        if (count == graph.length) {
            found = true;
            return;
        }
        visited[current] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[current][i] == 1 && !visited[i]) {
                dfs(graph,i,visited,count+1);
            }
        }
        visited[current] = false;
    }
}