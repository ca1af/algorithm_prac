import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        boolean[] primes = new boolean[1000001];
        primes[0] = primes[1] = true;

        // Generate primes using Sieve of Eratosthenes
        for (int i = 2; i * i <= 1000000; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primes[j] = true;
                }
            }
        }

        // Count the number of goldbach partitions
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (!primes[i] && !primes[n - i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
