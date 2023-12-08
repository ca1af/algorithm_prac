import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            // N과 M의 모든 공약수를 출력해라

            List<Integer> integers = getInts(N, M);

            for (Integer integer : integers) {
                StringBuilder sb = new StringBuilder();
                sb.append(integer)
                        .append(" ")
                        .append(N / integer)
                        .append(" ")
                        .append(M / integer);
                System.out.println(sb);
            }
        }

        public static int gcd(int a, int b){
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public static List<Integer> getInts(int a, int b){
            int gcd = gcd(a, b);
            List<Integer> integers = new ArrayList<>();
            for (int i = 1; i <= gcd; i++) {
                if (gcd % i == 0){
                    integers.add(i);
                }
            }
            return integers;
        }
    }