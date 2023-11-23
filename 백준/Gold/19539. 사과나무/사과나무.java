import java.io.*;
import java.util.StringTokenizer;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 횟수
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int odds = 0;

            for (int i = 0; i < N; i++) {
                int token = Integer.parseInt(st.nextToken());
                sum += token;
                if (token % 2 == 1){
                    odds++;
                }
            }

            String answer = "NO";

            if (sum % 3 == 0 && odds <= sum / 3){
                answer = "YES";
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.append(answer);
            bw.flush();
        }
    }