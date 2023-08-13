import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 테스트케이스의 수


            StringTokenizer st;

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < N; i++) {
                int T = Integer.parseInt(br.readLine()); // 주어질 녀석들의 갯수

                long[] arr = new long[T];

                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < T; j++) {
                    arr[j] = Integer.parseInt(st.nextToken());
                }

                long result = calculate(arr);

                bw.append(String.valueOf(result)).append("\n");
            }

            bw.flush();
        }

        static long calculate(long[] arr){
            long max = arr[arr.length - 1];
            long sum = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] >= max){
                    max = arr[i];
                } else {
                    sum += max - arr[i];
                }
            }

            return sum;
        }
    }