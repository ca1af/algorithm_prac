import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        long[] dp = new long[101]; 

        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = scanner.nextInt();
            sb.append(dp[N]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
