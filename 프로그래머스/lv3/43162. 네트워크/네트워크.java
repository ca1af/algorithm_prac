import java.util.*;

class Solution {
    static boolean[] isVisited;
    static ArrayList<Integer>[] edges;
    static int count = 0;

    public int solution(int n, int[][] computers) {
        isVisited = new boolean[n];
        edges = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    edges[i].add(j);
                }
            }
        }

        Arrays.fill(isVisited, false);

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                bfs(i);
                count++;
            }
        }

        return count;
    }

    private static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        isVisited[startNode] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : edges[node]) {
                if (!isVisited[neighbor]) {
                    queue.add(neighbor);
                    isVisited[neighbor] = true;
                }
            }
        }
    }
}
