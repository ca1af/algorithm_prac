import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());

            while (N -- > 0) {
                HashMap<String, Integer> map = new HashMap<>();

                int M = Integer.parseInt(br.readLine());

                while (M-- > 0) {
                    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                    st.nextToken();
                    String category = st.nextToken();
                    map.put(category, map.getOrDefault(category, 0) + 1);
                }

                int result = 1;

                for (int val : map.values()) {
                    result *= (val + 1);
                }
                sb.append(result - 1).append('\n');
            }
            System.out.println(sb);
        }
    }