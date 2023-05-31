import java.util.*;

public class Main {
        // https://www.acmicpc.net/problem/11659
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int M = sc.nextInt(); // 배열의 길이
            int N = sc.nextInt(); // 구간합 구해야 하는 개수

            int[] arr = new int[M];

            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }

            int[] preFixSum = new int[M];

            preFixSum[0] = arr[0];

            // 5,4,3,2,1 인 경우
            // prefixSum[0] = 5;
            // prefixSum[1] = 5 + 4 = 9
            // prefixSum[2] = 9 + 3 = 12
            // ... 14
            // prefixSum[4] = 14 + 1 = 15

            for (int i = 1; i < arr.length; i++) {
                preFixSum[i] = preFixSum[i - 1] + arr[i];
            }

            for (int i = 0; i < N; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();

                // 구간합 계산
                int sum = preFixSum[to - 1] - (from > 1 ? preFixSum[from - 2] : 0);

                System.out.println(sum);
            }
        }
}
