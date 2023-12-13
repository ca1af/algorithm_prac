import java.io.*;
import java.util.StringTokenizer;
  
public class Main{
        static int N;
        static int M;
        static int[] arr;
        static boolean[] visit;
        static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken()); // 1 - N 까지의 수 중
            M = Integer.parseInt(st.nextToken()); // M 길이의 수열, 중복없이.

            arr = new int[M];
            visit = new boolean[N];

            dfs(1, 0);

            System.out.println(sb.toString());
        }

        public static void dfs(int start, int depth){
            // ex : 3 2 라면

            // 1 2
            // 1 3
            // 2 3

            // 스타트에서 증가는 한다. 대신 돌아오지 않는다. -> 반복문을 좀 잘 살펴봐라 이새끼야 휴

            if (depth == M){
                for (int each : arr) {
                    sb.append(each).append(" ");
                }
                sb.append("\n");
                return;
            }

            for (int i = 1; i <= N; i++) {
                arr[depth] = i;
                dfs(i + 1, depth + 1);
            }
        }
    }