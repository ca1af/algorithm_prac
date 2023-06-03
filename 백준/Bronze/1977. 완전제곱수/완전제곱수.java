import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = -1;
        int sum = 0;

        for (int i = (int) Math.sqrt(M); i <= (int) Math.sqrt(N); i++) {
            int square = i * i;
            if (square >= M && square <= N) {
                sum += square;
                if (min == -1 || square < min) {
                    min = square;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
