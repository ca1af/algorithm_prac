import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
        static boolean[] visited;
        static ArrayList<Integer>[] A;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); // 노드 개수
            int m = Integer.parseInt(st.nextToken()); // 엣지 개수

            visited = new boolean[n + 1]; // 0번 인덱스 사용하면 헷갈리니까 걍 N+1 선언

            A = new ArrayList[n+1];

            for (int i = 1; i < A.length; i++) {
                A[i] = new ArrayList<>(); // 실제 객체 선언
            }
            for (int i = 0; i < m; i++) { // 엣지 개수만큼 (== 주어지는 엣지 정보 담기 위해)
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                A[start].add(end); //  시작점에서 종료점으로 갈 수 있다
                A[end].add(start); // 종료점에서 시작점으로 갈 수 있다.
            }

            int count = 0;

            for (int i = 1; i < n + 1; i++) { // 1~n+1 이 어레이리스트의 유효지점이기 때문에 맞춰준다
                if (!visited[i]){ // 방문하지 않은 노드가 있으면
                    count++;
                    dfs(i); // 방문하지 않은 해당 노드 기준으로 dfs 실행!
                }
            }
            System.out.println(count);
        }

        private static void dfs(int node) {
            if (visited[node]){ // 현재 노드가 이미 방문한 노드라면
                return;
            }
            visited[node] = true; // 방문하지 않았으면, 방문으로 만들고
            for (Integer integer : A[node]) { // 현재 노드에서 연결되어 있는 노드 모두 돌면서
                if (!visited[integer]){ // 인접리스트 안에 있는 요소가 아직 탐색되지 않은 노드라면
                    dfs(integer); // 탐색하지 않은 노드 기준으로 다시 dfs 실행해라!
                }
            }
        }
    }