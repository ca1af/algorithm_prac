import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int K = Integer.parseInt(st.nextToken()); // 주어지는 동전의 개수
            int N = Integer.parseInt(st.nextToken()); // 목표금액 N

            int[] kArr = new int[K];

            for (int i = 0; i < K; i++) {
                kArr[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;

            for (int i = kArr.length - 1; i >= 0; i--) {
                if (kArr[i] <= N){
                    while (N >= kArr[i]){
                        N -= kArr[i];
                        count++;
                    }
                }
            }

            System.out.println(count);

        }
    }