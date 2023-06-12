import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 주어지는 표본수
            int M = Integer.parseInt(st.nextToken()); // 검사해야 하는 녀석들
            
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(br.readLine(), 1);
            }
            
            int answer = 0;

            for (int i = 0; i < M; i++) {
                if (map.containsKey(br.readLine())){
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }