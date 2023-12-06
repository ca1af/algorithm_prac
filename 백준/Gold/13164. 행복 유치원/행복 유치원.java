import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
        public static void main(String[] args) throws IOException {
            // 비용 = 조 안에서 젤큰 - 젤작

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 원생 수
            int M = Integer.parseInt(st.nextToken()); // 조의 갯수

            int[] arr = new int[N]; // 이 [] 는 정렬되어 있다.
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 1 3 5 6 10 -> 1/3 5/6 10

            // 2 2 1 4 -> 1 2 합치면 3이다.

            int[] distanceArr = new int[N - 1];
            for (int i = 1; i < arr.length; i++) {
                distanceArr[i - 1] = arr[i] - arr[i - 1];
            }

            Arrays.sort(distanceArr);

            int answer = 0;

            for (int i = 0; i < N - M; i++) {
                answer += distanceArr[i];
            }

            System.out.println(answer);
        }
    }