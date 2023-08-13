import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 작은 수
            int M = Integer.parseInt(st.nextToken()); // 큰수

            int count = 0;

            boolean flag = false;

            while (M >= N){
                if (M % 2 == 0){
                    M /= 2;
                    count++;
                }
                else if (isOne(M)){
                    M /= 10;
                    count++;
                } else {
                    break;
                }

                if (N == M) {
                    flag = true;
                    break;
                }
            }

            if (flag) System.out.println(count + 1);
            else System.out.println(-1);
        }

        static boolean isOne(int m){
            String s = String.valueOf(m);
            return s.charAt(s.length() - 1) == '1';
        }
    }