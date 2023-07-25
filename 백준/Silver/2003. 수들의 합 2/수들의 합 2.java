import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 테스트케이스 개수
            int M = Integer.parseInt(st.nextToken()); // 누적합 목표

            int[] arr = new int[N];
            int[] prefixSum = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            prefixSum[0] = 0;
            arr[0] = prefixSum[1] = Integer.parseInt(st.nextToken()); // 첫번째놈은 명시적으로 받아줌
            for (int i = 1; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                prefixSum[i + 1] = arr[i] + prefixSum[i];
            }

            int start = 0;
            int end = 1;

            int answer = 0;

            while (end < prefixSum.length){
                int sum = prefixSum[end] - prefixSum[start];

                ////1 3 5 9 11 16 19 20 21 23 < 누적합 배열
                // 1 2 3 4

                if (sum < M) { // 목표치보다 작다면, 오른쪽을 늘려야 하낟.
                    end++;
                } else if (sum > M){
                    start++;
                } else {
                    answer++; // 같을때는 증가시키고,
                    start++; // 시작도 하나 증가해줌.
                }
            }

            System.out.println(answer);
        }
    }