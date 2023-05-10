import java.io.*;

public class Main {

        static int count = 0;
        static int[] dp;
        static int dpCount = 0;


        static int fibonazzi(int n){
            if (n == 1 || n == 2){
                count++;
                return 1;
            } else return fibonazzi(n-1) + fibonazzi(n-2);
        }

        static int fibonazziDp(int n){
            dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 1;

            for (int i = 3; i <= n; i++) {
                dpCount++;
                dp[n] = dp[n-1] + dp[n-2];
            }

            return dp[n];
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int parsedInt = Integer.parseInt(br.readLine());

            fibonazzi(parsedInt);
            fibonazziDp(parsedInt);

            bw.append(String.valueOf(count)).append(" ");
            bw.append(String.valueOf(dpCount));
            bw.flush();
            bw.close();
            br.close();
        }


    }