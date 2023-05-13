import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기값 설정
        dp[0][0] = triangle[0][0];

        // 다이나믹 프로그래밍으로 최대값 계산
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // 왼쪽 위에서 내려오는 경우
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                }
                // 오른쪽 위에서 내려오는 경우
                else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                }
                // 두 방향에서 내려오는 경우 중 큰 값 선택
                else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 최대값 찾기
        int maxSum = 0;
        for (int j = 0; j < n; j++) {
            maxSum = Math.max(maxSum, dp[n - 1][j]);
        }

        System.out.println(maxSum);
    }
}
