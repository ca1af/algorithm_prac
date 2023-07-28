import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] given = new int[N + 1]; // 원본 어레이 사용하지 않으므로 그냥 바로 해줄것
            given[0] = 0;

            for (int i = 1; i <= N; i++) {
                given[i] = Integer.parseInt(st.nextToken());
                given[i] += given[i - 1]; // 여기서 바로 그냥 계싼때림
            }

            int M = Integer.parseInt(br.readLine());
            int[] answer = new int[M];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                answer[i] = given[end] - given[start - 1];
            }

            for (int i : answer) {
                System.out.println(i);
            }
        }
    }