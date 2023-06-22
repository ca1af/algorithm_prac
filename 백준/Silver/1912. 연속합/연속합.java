import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;

            int[] arr = new int[N];
            int[] dp = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dp[0] = arr[0];

            int max = arr[0];

            for (int i = 1; i < dp.length; i++) {
                dp[i] = Math.max(dp[i-1] + arr[i], arr[i]); // 여기가 진짜 핵심인듯...이전까지의 합이 현재 원소보다 적으면 버린다는 개념

                max = Math.max(max, dp[i]);
            }

            System.out.println(max);
        }
    }