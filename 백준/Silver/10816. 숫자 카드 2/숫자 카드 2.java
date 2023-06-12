import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 실제 가지고있는 카드 개수들
            StringTokenizer st = new StringTokenizer(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int card = Integer.parseInt(st.nextToken());
                map.put(card, map.getOrDefault(card, 0) + 1); // 맵에 개수별로 정리
            }

            int M = Integer.parseInt(br.readLine()); // 해당 카드 몇개있는지 물어보는것

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int X = Integer.parseInt(st.nextToken());
                if (!map.containsKey(X)) bw.append("0");
                else {
                    bw.append(String.valueOf(map.get(X)));
                }

                if (i != M - 1){
                    bw.append(" ");
                }
            }

            bw.flush();
        }
    }