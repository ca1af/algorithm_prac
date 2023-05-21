import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        int[][] dp = new int[41][2];
        dp[0][0] = 1; // 초기값: N=0일 때의 0의 개수
        dp[0][1] = 0; // 초기값: N=0일 때의 1의 개수
        dp[1][0] = 0; // 초기값: N=1일 때의 0의 개수
        dp[1][1] = 1; // 초기값: N=1일 때의 1의 개수

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0]; // N일 때의 0의 개수는 N-1일 때와 N-2일 때의 0의 개수 합산
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1]; // N일 때의 1의 개수는 N-1일 때와 N-2일 때의 1의 개수 합산
        }

        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}
