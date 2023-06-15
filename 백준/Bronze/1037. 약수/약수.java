import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] divisors = new int[N];

        for (int i = 0; i < N; i++) {
            divisors[i] = scanner.nextInt();
        }

        Arrays.sort(divisors);
        int result = divisors[0] * divisors[N - 1];

        System.out.println(result);
    }
}
