import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            long answer = 0; // int 대신 long 사용 (값이 클 수 있음)

        for (int i = N - 1; i >= 0; i--) {
            int calculated = arr[i] - (N - i - 1);
            if (calculated > 0) {
                answer += calculated;
            }
        }

            System.out.println(answer);
        }
    }