import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] edges;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // node
        int M = Integer.parseInt(st.nextToken()); // edge
        int V = Integer.parseInt(st.nextToken()); // starting point

        edges = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            edges[i] = new ArrayList<>(); // 1부터 N까지의 노드 저장
        }

        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            edges[start].add(end);
            edges[end].add(start);
            // 인접 리스트 완성, 방향성 없으므로 양방향으로 선언
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(edges[i]);
        }

        dfs(V);
        System.out.println();

        visited = new boolean[N + 1]; // visited 배열 초기화

        bfs(V);
        System.out.println();
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nextNode : edges[node]) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int nextNode : edges[node]) {
                if (!visited[nextNode]) {
                    queue.offer(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }
}
