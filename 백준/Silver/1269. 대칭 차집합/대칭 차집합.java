import java.util.*;
import java.io.*;

public class Main  {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            HashMap<Integer, Integer> map = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int given = Integer.parseInt(st.nextToken());
                map.put(given, 0);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int given = Integer.parseInt(st.nextToken());
                if (!map.containsKey(given)) map.put(given, 0);
                else map.remove(given);
            }

            System.out.println(map.size());
        }
    }