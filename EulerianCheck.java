package Practice;
import java.util.*;

public class EulerianCheck {
    public static void main(String[] args) {
        int[][] graph = {
            {0,1,0,1},
            {1,0,1,0},
            {0,1,0,1},
            {1,0,1,0}
        };
        if (isEulerian(graph)) {
            System.out.println("This graph has an Eulerian Circuit.");
        } else {
            System.out.println("No Eulerian Circuit in this graph.");
        }
    }
    static boolean isEulerian(int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            int degree = 0;
            for (int j = 0; j < graph.length; j++) {
                degree += graph[i][j];
            }
            if (degree % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}