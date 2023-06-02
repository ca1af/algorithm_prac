import java.util.*;
import java.io.*;

public class Main {

        static ArrayList<Integer>[] edges;

        static boolean[] visited;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st;

            int M = Integer.parseInt(br.readLine()); // 총 컴퓨터 개수 == node
            int N = Integer.parseInt(br.readLine()); // 총 연결 개수 == edge

            edges = new ArrayList[M + 1];

            visited = new boolean[M + 1]; // 1번 컴퓨터부터 시작하기 위해 0번 버림

            Arrays.fill(visited, false); // 0번도 그냥 false로 초기화. 마지막 정답 도출 때 -1 해야함

            for (int i = 1; i < M + 1; i++) { // N+1 부터 시작하기 위해, edges 의 초기화 (1부터)
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                edges[start].add(end);
                edges[end].add(start); // 양방향 추가
            }

            dfs(1); // 항상 1번노드로 dfs 수행

            int count = 0;

            for (boolean b : visited) {
                if (b) count++;
            }

            System.out.println(count - 1);
        }

        public static void dfs(int node){
            visited[node] = true;

            for (Integer integer : edges[node]) { // 1번과 연결된 노드들 순회
                if (visited[integer]) continue;
                dfs(integer);
            }
        }
    }