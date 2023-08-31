import java.util.*;
import java.io.*;

    

public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 테케 개수
            int K = Integer.parseInt(st.nextToken()); // 1 포함해야 하는 갯수

            st = new StringTokenizer(br.readLine());
            List<Integer> idxArray = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int given = Integer.parseInt(st.nextToken());
                if (given == 1) idxArray.add(i);
            }

            int start = 0;
            int min = Integer.MAX_VALUE;

            if (idxArray.size() < K) {
                System.out.println(-1);
                return;
            }
            while (start + K - 1 < idxArray.size()) {
                int picked = idxArray.get(start + K - 1) - idxArray.get(start) + 1;
                if (picked < min) min = picked;
                start++;
            }


            System.out.println(min);
        }
    }