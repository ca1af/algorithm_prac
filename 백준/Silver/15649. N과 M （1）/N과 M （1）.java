import java.io.*;
import java.util.StringTokenizer;

public class Main {
        public static int N;
        public static int M;
        public static int[] arr;
        public static boolean[] visit;
        public static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[M];
            visit = new boolean[N];

            dfs(0);
            System.out.println(sb);

        }
        public static void dfs(int depth){
            if (depth == M){
                for (int each : arr) {
                    sb.append(each).append(" ");
                }
                sb.append("\n");
                return;
            }

            for (int i = 0; i < N; i++) {
                if (!visit[i]){
                    visit[i] = true; // 방문 표시
                    arr[depth] = i + 1; // 0부터 시작하므로 +1
                    dfs(depth + 1);
                    visit[i] = false;
                }
            }
        }

    }