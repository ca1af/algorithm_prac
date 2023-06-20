import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 구하고자 하는 숫자의 개수
            int S = Integer.parseInt(st.nextToken()); // 목표 합

            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int given = Integer.parseInt(st.nextToken());
                arr[i] = given;
            }

            int startIdx = 0;
            int endIdx = 0;
            int min = Integer.MAX_VALUE;
            int sum = 0;

            while (true) {
                if (sum >= S) { // 누적합보다 크다면
                    sum -= arr[startIdx++];
                    min = Math.min(endIdx - startIdx + 1, min);
                } else if (endIdx == N) {
                    break;
                } else {
                    sum += arr[endIdx++];
                }
            }

            if (min != Integer.MAX_VALUE) System.out.println(min);
            else System.out.println(0);
        }
    }