import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for (int i = N - 1; i >= 0; i--) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                }
                for (int i1 = 0; i1 < N - i; i1++) {
                    sb.append("*");
                }
                System.out.println(sb.toString());
            }
        }
    }