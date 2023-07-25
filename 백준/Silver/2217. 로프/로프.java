import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 로프의 개수

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            int max = Integer.MIN_VALUE;

            // 예를 들어 8, 10, 15 라면?
            for (int i = 0; i < N; i++) {
                max = Math.max(max, arr[i] * (N - i)); // 왜냐면 더 많은 중량을 버티는 로프들이 버텨주니까 N - i
            }

            System.out.println(max);
        }
    }