import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 입력 개수
            StringTokenizer st;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int gcd = gcd(a, b);
                int lcd = (a * b / gcd);
                bw.append(String.valueOf(lcd));
                if (i != N - 1) bw.append("\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }

        public static int gcd(int a, int b){
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }