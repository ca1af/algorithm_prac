import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer S = new StringBuffer(br.readLine());
            StringBuffer T = new StringBuffer(br.readLine());

            while (S.length() < T.length()) {
                int index = T.length() - 1;
                char picked = T.charAt(index);
                T.deleteCharAt(index);
                if (picked == 'B') {
                    T.reverse();
                }
            }

            if (S.toString().contentEquals(T)) {
                System.out.println(1);
                return;
            }
            System.out.println(0);
        }
    }