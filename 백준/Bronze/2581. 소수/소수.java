import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        int minPrime = -1;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (minPrime == -1) {
                    minPrime = i;
                }
                sum += i;
            }
        }

        if (minPrime == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }

        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
